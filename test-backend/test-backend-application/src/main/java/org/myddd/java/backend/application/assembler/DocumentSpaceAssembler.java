package org.myddd.java.backend.application.assembler;

import org.myddd.java.backend.api.dto.DocumentSpaceDTO;
import org.myddd.java.backend.domain.core.DocumentSpace;

import javax.inject.Named;
import java.util.Objects;

@Named
public class DocumentSpaceAssembler {

    public DocumentSpace toEntity(DocumentSpaceDTO dto){
        if(Objects.isNull(dto))return null;

        DocumentSpace entity = new DocumentSpace();
        entity.setId(dto.getId());
        entity.setVersion(dto.getVersion());
        entity.setSpaceId(dto.getSpaceId());
        entity.setName(dto.getName());
        entity.setCreated(dto.getCreated());
        return entity;
    }

    public DocumentSpaceDTO toDTO(DocumentSpace entity){
        if(Objects.isNull(entity))return null;

        DocumentSpaceDTO dto = new DocumentSpaceDTO();
        dto.setId(entity.getId());
        dto.setVersion(entity.getVersion());
        dto.setSpaceId(entity.getSpaceId());
        dto.setName(entity.getName());
        dto.setCreated(entity.getCreated());
        return dto;
    }
}
