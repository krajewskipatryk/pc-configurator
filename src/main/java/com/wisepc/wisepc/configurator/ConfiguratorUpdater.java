package com.wisepc.wisepc.configurator;

import com.wisepc.wisepc.configurator.model.ConfiguratorUpdateRequest;
import com.wisepc.wisepc.configurator.model.Configuration;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class ConfiguratorUpdater {
    private final ConfiguratorMapper configuratorMapper;
    private final ConfiguratorRepository configuratorRepository;

    void updateConfiguratorAndSave(Configuration existingConfiguration, ConfiguratorUpdateRequest configuratorUpdateRequest) {

    }
}
