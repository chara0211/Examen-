package org.xproce.examenbib.service;

import org.xproce.examenbib.dao.entities.Emprunt;
import org.xproce.examenbib.dao.entities.Utilisateur;
import org.xproce.examenbib.dao.repositories.EmpruntRepository;
import org.xproce.examenbib.dao.repositories.UtilisateurRepository;
import org.xproce.examenbib.dto.EmpruntDto;
import org.xproce.examenbib.mapper.EmpruntMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmpruntServiceImpl implements IEmpruntService {
    @Autowired
    private EmpruntMapper empruntMapper;

    @Autowired
    private EmpruntRepository empruntRepository;

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Override
    public EmpruntDto ajouterEmprunt(EmpruntDto empruntDto) {
        return empruntMapper.FromEntityToDto(
                empruntRepository.save(
                        empruntMapper.FromDtoToEntity(empruntDto)
                ));
    }

    @Override
    public List<EmpruntDto> listerLivresEmpruntesParUtilisateur(Utilisateur utilisateur) {

        return null;
    }

}
