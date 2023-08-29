package com.wisepc.wisepc.session;

import com.wisepc.wisepc.session.model.Session;

import java.time.LocalDateTime;
import java.util.UUID;

class SessionCreator {
    Session session;
    public Session buildSession() {
        session = new Session();

        session.setSessionToken(UUID.randomUUID().toString());
        session.setExpired(false);
        session.setCreatedDate(LocalDateTime.now());


        return session;
    }


}