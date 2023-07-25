package com.wisepc.wisepc.session;

public interface SessionService {
    String createSession();
    Boolean validateSession(String sessionToken);

}
