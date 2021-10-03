package org.myddd.java.backend.application.assembler;

import org.myddd.java.backend.api.dto.DocumentHistoryDTO;
import org.myddd.java.backend.domain.core.DocumentHistory;

import javax.inject.Named;

@Named
public class DocumentHistoryAssembler {

    public DocumentHistoryDTO toDTO(DocumentHistory entity){
        DocumentHistoryDTO dto = new DocumentHistoryDTO();
        dto.setHistoryVersion(entity.getHistoryVersion());
        dto.setMd5(entity.getMd5());
        dto.setName(entity.getName());
        dto.setMediaId(entity.getMediaId());
        dto.setCreated(entity.getCreated());
        dto.setRemark(entity.getRemark());
        return dto;
    }
}
