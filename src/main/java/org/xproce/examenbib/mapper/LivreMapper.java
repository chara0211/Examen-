package org.xproce.examenbib.mapper;

import org.modelmapper.ModelMapper;
import org.xproce.examenbib.dao.entities.Livre;
import org.xproce.examenbib.dto.LivreDto;

public class LivreMapper {

    ModelMapper modelMapper = new ModelMapper();

    public LivreDto EntityToDto(Livre livre) {

        return modelMapper.map(livre, LivreDto.class);
    }

    public Livre DtoToEntity(LivreDto livreDto) {

        return modelMapper.map(livreDto, Livre.class);
    }
}
