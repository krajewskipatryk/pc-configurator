package com.wisepc.wisepc.session;

/**
 * TODO: Create refreshSession method
 */
public interface SessionService {
    String createSession();
    Boolean validateSession(String sessionToken);

}
