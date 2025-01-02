package org.xproce.examenbib.dao.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private String email;

    @OneToMany(mappedBy = "emprunteur", fetch = FetchType.LAZY)
    private List<Emprunt> emprunts;

    @OneToMany(mappedBy = "proprietaire", fetch = FetchType.LAZY)
    private List<Livre> livres;
}
