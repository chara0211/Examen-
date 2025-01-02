package org.xproce.examenbib.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.examenbib.dao.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
}
