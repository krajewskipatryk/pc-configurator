package com.wisepc.wisepc.part.mapper;

import com.wisepc.wisepc.model.part.domain.Case;
import com.wisepc.wisepc.part.request.CaseCreationRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CaseMapper {
    CaseMapper instance = Mappers.getMapper(CaseMapper.class);

    Case caseCreationRequestToCase(CaseCreationRequest caseCreationRequest);
}
