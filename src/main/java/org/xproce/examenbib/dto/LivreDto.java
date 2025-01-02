package org.xproce.examenbib.dto;

import org.xproce.examenbib.dao.entities.Livre.StatusLivre;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LivreDto {
    private Long id;
    private String titre;
    private String auteur;
    private Date datePublication;
    private String isbn;
    private StatusLivre status;
    private Long proprietaireId;

    // lier le livre à son prop
    private UtilisateurDto proprietaireDto;


    public UtilisateurDto getProprietaire() {
        return proprietaireDto;
    }

    public void setProprietaire(UtilisateurDto proprietaireDto) {
        this.proprietaireDto = proprietaireDto;
    }
}
