package com.wisepc.wisepc.configurator;

import com.wisepc.wisepc.configurator.dto.ConfiguratorUpdateRequest;
import com.wisepc.wisepc.model.configurator.dao.ConfiguratorRepository;
import com.wisepc.wisepc.model.configurator.domain.Configuration;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class ConfiguratorUpdater {
    private final ConfiguratorMapper configuratorMapper;
    private final ConfiguratorRepository configuratorRepository;

    void updateConfiguratorAndSave(Configuration existingConfiguration, ConfiguratorUpdateRequest configuratorUpdateRequest) {

    }
}
