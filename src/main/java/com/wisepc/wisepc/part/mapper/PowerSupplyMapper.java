package com.wisepc.wisepc.part.mapper;

import com.wisepc.wisepc.model.part.domain.PowerSupply;
import com.wisepc.wisepc.part.request.PowerSupplyCreationRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PowerSupplyMapper {
    PowerSupplyMapper instance = Mappers.getMapper(PowerSupplyMapper.class);

    PowerSupply powerSupplyCreationRequestToPowerSupply(PowerSupplyCreationRequest powerSupplyCreationRequest);
}
