package org.xproce.examenbib.service;

import org.xproce.examenbib.dao.entities.Emprunt;
import org.xproce.examenbib.dao.entities.Utilisateur;
import org.xproce.examenbib.dto.EmpruntDto;

import java.util.List;

public interface IEmpruntService {
    EmpruntDto ajouterEmprunt(EmpruntDto empruntDtO);
    List<EmpruntDto> listerLivresEmpruntesParUtilisateur(Utilisateur utilisateur);


}
