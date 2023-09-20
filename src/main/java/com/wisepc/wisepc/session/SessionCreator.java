package com.wisepc.wisepc.session;

import com.wisepc.wisepc.model.session.domain.Session;

import java.time.LocalDateTime;
import java.util.UUID;

class SessionCreator {
    public Session buildSession() {
        Session session = new Session();

        session.setSessionToken(UUID.randomUUID().toString());
        session.setExpired(false);
        session.setCreatedDate(LocalDateTime.now());


        return session;
    }


}