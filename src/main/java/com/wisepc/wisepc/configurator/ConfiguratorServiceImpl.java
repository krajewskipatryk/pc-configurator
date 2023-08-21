package com.wisepc.wisepc.configurator;

import com.wisepc.wisepc.configurator.model.ComputerUpdateRequest;

import com.wisepc.wisepc.configurator.model.Configuration;
import com.wisepc.wisepc.session.SessionService;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;

@RequiredArgsConstructor
class ConfiguratorServiceImpl implements ConfiguratorService {
    private final SessionService sessionService;

    @Override
    public String updateComputerConfiguration(String sessionToken, ComputerUpdateRequest computerUpdateRequest) {
        try {
            Configuration configuration = sessionService.getConfigurationBySessionToken(sessionToken);
        } catch (EmptyResultDataAccessException e) {

        }
        return null;
    }
}
