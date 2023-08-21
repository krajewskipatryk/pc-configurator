package com.wisepc.wisepc.session;

import com.wisepc.wisepc.configurator.model.Configuration;

/**
 * TODO: Create refreshSession method
 */
public interface SessionService {
    String createSession();
    Boolean validateSession(String sessionToken);
    Configuration getConfigurationBySessionToken(String sessionToken);

}
