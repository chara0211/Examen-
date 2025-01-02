package org.xproce.examenbib.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.examenbib.dao.entities.Livre;

import java.util.List;

public interface LivreRepository extends JpaRepository<Livre, Integer> {
    List<Livre> findByStatus(Livre.StatusLivre status);


}
