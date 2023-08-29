package com.wisepc.wisepc.configurator;

import com.wisepc.wisepc.configurator.model.Configuration;
import com.wisepc.wisepc.configurator.model.ConfiguratorUpdateRequest;
import com.wisepc.wisepc.session.SessionService;

import lombok.RequiredArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;

@RequiredArgsConstructor
class ConfiguratorServiceImpl implements ConfiguratorService {
    private final SessionService sessionService;
    private final ConfiguratorUpdater configuratorUpdater;
    private final ConfiguratorCreator configuratorCreator;

    @Override
    public void updateOrCreateSession(String sessionToken, ConfiguratorUpdateRequest configuratorUpdateRequest) {
        if (sessionService.validateSessionExist(sessionToken)) {
            Configuration existingConfiguration = sessionService.getConfigurationBySessionToken(sessionToken);

            updateComputerConfigurationForSession(existingConfiguration, configuratorUpdateRequest);
        } else {
            createNewConfiguration(configuratorUpdateRequest);
        }
    }

    private void updateComputerConfigurationForSession(Configuration existingConfiguration, ConfiguratorUpdateRequest configuratorUpdateRequest) {
        configuratorUpdater.updateConfiguratorAndSave(existingConfiguration, configuratorUpdateRequest);
    }

    private void createNewConfiguration(ConfiguratorUpdateRequest configuratorUpdateRequest) {

    }
}
