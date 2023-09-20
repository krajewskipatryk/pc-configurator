package com.wisepc.wisepc.configurator;

import com.wisepc.wisepc.configurator.dto.ConfiguratorUpdateRequest;
import com.wisepc.wisepc.model.configurator.domain.Configuration;

import lombok.RequiredArgsConstructor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ConfiguratorMapper {
    ConfiguratorMapper instance = Mappers.getMapper(ConfiguratorMapper.class);

    Configuration mergeComputerRequestIntoEntity(ConfiguratorUpdateRequest configuratorUpdateRequest);
}
