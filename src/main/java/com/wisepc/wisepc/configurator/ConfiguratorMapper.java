package com.wisepc.wisepc.configurator;

import com.wisepc.wisepc.configurator.model.ComputerUpdateRequest;
import com.wisepc.wisepc.configurator.model.ConfigurationDto;
import com.wisepc.wisepc.model.parts.dao.PartDao;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class ConfiguratorMapper {
    private final ConfiguratorRepository configuratorRepository;
    private final PartDao partDao;
    
    public ConfigurationDto mapComputerRequestToDto(ComputerUpdateRequest computerUpdateRequest) {
        return null;
    }
}
