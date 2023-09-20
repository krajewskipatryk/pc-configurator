package com.wisepc.wisepc.part.mapper;

import com.wisepc.wisepc.model.part.domain.HardDrive;
import com.wisepc.wisepc.part.request.HardDriveCreationRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface HardDriveMapper {
    HardDriveMapper instance = Mappers.getMapper(HardDriveMapper.class);

    HardDrive hardDriveCreationRequestToHardDrive(HardDriveCreationRequest hardDriveCreationRequest);
}
