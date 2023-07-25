package com.wisepc.wisepc.session.domain;

public interface SessionService {
    String createSession();
    Boolean validateSession(String sessionToken);

}
