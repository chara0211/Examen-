package org.xproce.examenbib.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.examenbib.dao.entities.Emprunt;
import org.xproce.examenbib.dao.entities.Utilisateur;

import java.util.List;

public interface EmpruntRepository extends JpaRepository<Emprunt, Long> {
    List<Emprunt> findByEmprunteur(Utilisateur utilisateur);
}
