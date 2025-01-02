package org.xproce.examenbib.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmpruntDto {
    private Long id;
    private Date dateEmprunt;
    private Date dateRetourPrevu;

    // Pour lier l'emprunt à un utilisateur (emprunteur)
    private UtilisateurDto utilisateurDto;
    private LivreDto livreDto;  // Pour lier l'emprunt à un livre

    // Getter et Setter pour utilisateurDto
    public UtilisateurDto getUtilisateur() {
        return utilisateurDto;
    }

    public void setUtilisateur(UtilisateurDto utilisateurDto) {
        this.utilisateurDto = utilisateurDto;
    }

    // Getter et Setter pour livreDto
    public LivreDto getLivre() {
        return livreDto;
    }

    public void setLivre(LivreDto livreDto) {
        this.livreDto = livreDto;
    }
}
