package com.wisepc.wisepc.part.mapper;

import com.wisepc.wisepc.model.part.domain.Motherboard;
import com.wisepc.wisepc.part.request.MotherboardCreationRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MotherboardMapper {
    MotherboardMapper instance = Mappers.getMapper(MotherboardMapper.class);

    Motherboard motherboardCreationRequestToMotherboard(MotherboardCreationRequest motherboardCreationRequest);
}
