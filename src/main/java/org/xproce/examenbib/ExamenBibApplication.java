package org.xproce.examenbib;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.xproce.examenbib.dao.entities.Emprunt;
import org.xproce.examenbib.dao.entities.Livre;
import org.xproce.examenbib.dao.entities.Utilisateur;
import org.xproce.examenbib.dao.repositories.EmpruntRepository;
import org.xproce.examenbib.dao.repositories.LivreRepository;
import org.xproce.examenbib.dao.repositories.UtilisateurRepository;

import java.util.Date;

@SpringBootApplication
public class ExamenBibApplication implements CommandLineRunner {

	private final UtilisateurRepository utilisateurRepository;
	private final LivreRepository livreRepository;
	private final EmpruntRepository empruntRepository;

	public ExamenBibApplication(UtilisateurRepository utilisateurRepository, LivreRepository livreRepository, EmpruntRepository empruntRepository) {
		this.utilisateurRepository = utilisateurRepository;
		this.livreRepository = livreRepository;
		this.empruntRepository = empruntRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setNom("El hadchi");
		utilisateur.setPrenom("Wafaa");
		utilisateur.setEmail("ELHADCHIWAFAA@example.com");
		utilisateurRepository.save(utilisateur);

		Livre livre1 = new Livre();
		livre1.setTitre("JEE");
		livre1.setAuteur("WAFAA");
		livre1.setIsbn("1234567J");
		livre1.setStatus(Livre.StatusLivre.DISPONIBLE);
		livre1.setProprietaire(utilisateur);
		livreRepository.save(livre1);

		// Création d'un emprunt
		Emprunt emprunt = new Emprunt();
		emprunt.setDateEmprunt(new Date());
		emprunt.setDateRetourPrevu(new Date(System.currentTimeMillis() + 7 * 24 * 60 * 60 * 1000)); // Retour prévu dans 7 jours
		emprunt.setEmprunteur(utilisateur);
		emprunt.setLivre(livre1);
		empruntRepository.save(emprunt);

		System.out.println("Utilisateur : " + utilisateur.getNom() + " " + utilisateur.getPrenom());
		System.out.println("Livre : " + livre1.getTitre() + " - Statut : " + livre1.getStatus());
		System.out.println("Emprunt enregistré pour l'utilisateur : " + emprunt.getEmprunteur().getNom());
	}

	public static void main(String[] args) {
		SpringApplication.run(ExamenBibApplication.class, args);
	}
}
