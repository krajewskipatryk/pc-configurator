package com.wisepc.wisepc.part.mapper;

import com.wisepc.wisepc.model.part.domain.Ram;
import com.wisepc.wisepc.part.request.RamCreationRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RamMapper {
    RamMapper instance = Mappers.getMapper(RamMapper.class);

    Ram ramCreationRequestToRam(RamCreationRequest ramCreationRequest);
}
