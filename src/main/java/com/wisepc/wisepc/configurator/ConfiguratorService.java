package com.wisepc.wisepc.configurator;

import com.wisepc.wisepc.configurator.dto.ConfiguratorUpdateRequest;

public interface ConfiguratorService {
    void updateOrCreateSession(String sessionToken, ConfiguratorUpdateRequest configuratorUpdateRequest);
}
