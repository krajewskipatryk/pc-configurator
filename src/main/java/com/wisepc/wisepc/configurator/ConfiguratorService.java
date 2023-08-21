package com.wisepc.wisepc.configurator;

import com.wisepc.wisepc.configurator.model.ComputerUpdateRequest;

public interface ConfiguratorService {
    String updateComputerConfiguration(String sessionToken, ComputerUpdateRequest computerUpdateRequest);
}
