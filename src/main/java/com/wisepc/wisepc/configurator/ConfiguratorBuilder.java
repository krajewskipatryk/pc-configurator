package com.wisepc.wisepc.configurator;

import com.wisepc.wisepc.configurator.model.Configuration;
import com.wisepc.wisepc.configurator.model.ConfigurationDto;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class ConfiguratorBuilder {
    private final ConfiguratorRepository configuratorRepository;

    Configuration createConfiguration(ConfigurationDto configurationDto) {
        Configuration mappedConfiguration = new Configuration();

        mappedConfiguration.setProcessor(configurationDto.processor());
        mappedConfiguration.setGraphicCard(configurationDto.graphicCard());
        mappedConfiguration.setMotherboard(configurationDto.motherboard());
        mappedConfiguration.setPowerSupply(configurationDto.powerSupply());
        mappedConfiguration.setRams(configurationDto.rams());
        mappedConfiguration.setHardDrives(configurationDto.hardDrives());
        mappedConfiguration.setComputerCase(configurationDto.computerCase());

        return mappedConfiguration;
    }
}
