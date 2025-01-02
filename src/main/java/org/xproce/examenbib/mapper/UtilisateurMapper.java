package org.xproce.examenbib.mapper;

import org.modelmapper.ModelMapper;
import org.xproce.examenbib.dao.entities.Utilisateur;
import org.xproce.examenbib.dto.UtilisateurDto;

public class UtilisateurMapper {

    ModelMapper modelMapper = new ModelMapper();


    public UtilisateurDto EntityToDto(Utilisateur utilisateur) {

        return modelMapper.map(utilisateur, UtilisateurDto.class);
    }

    public Utilisateur DtoToEntity(UtilisateurDto utilisateurDto) {

        return modelMapper.map(utilisateurDto, Utilisateur.class);
    }
}
