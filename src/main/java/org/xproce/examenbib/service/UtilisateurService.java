package org.xproce.examenbib.service;

import org.xproce.examenbib.dao.entities.Utilisateur;

import java.util.List;

public interface UtilisateurService {
    Utilisateur enregistrerUtilisateur(Utilisateur utilisateur);
    List<Utilisateur> recupererTousLesUtilisateurs();
}
