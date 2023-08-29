package com.wisepc.wisepc.session;

import com.wisepc.wisepc.configurator.model.Configuration;
import com.wisepc.wisepc.session.model.Session;

/**
 * TODO: Create refreshSession method
 */
public interface SessionService {
    Session createSession();
    Boolean validateSessionExist(String sessionToken);
    Configuration getConfigurationBySessionToken(String sessionToken);

}
