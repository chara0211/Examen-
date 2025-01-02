package org.xproce.examenbib.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.xproce.examenbib.dao.entities.Emprunt;
import org.xproce.examenbib.dto.EmpruntDto;

@Component
public class EmpruntMapper {
    ModelMapper modelMapper = new ModelMapper();

    public EmpruntDto FromEntityToDto(Emprunt emprunt) {

        return modelMapper.map(emprunt, EmpruntDto.class);
    }

    public Emprunt FromDtoToEntity(EmpruntDto empruntDto) {

        return modelMapper.map(empruntDto, Emprunt.class);
    }
    }



