package com.wisepc.wisepc.session;

import com.wisepc.wisepc.model.configurator.domain.Configuration;
import com.wisepc.wisepc.model.session.domain.Session;

/**
 * TODO: Create refreshSession method
 */
public interface SessionService {
    Session createSession();
    Boolean validateSessionExist(String sessionToken);
    Configuration getConfigurationBySessionToken(String sessionToken);

}
