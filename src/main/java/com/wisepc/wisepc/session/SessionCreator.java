package com.wisepc.wisepc.session;

import com.wisepc.wisepc.session.model.Session;

import java.time.LocalDateTime;
import java.util.UUID;

class SessionCreator {
    public Session buildSession() {
        Session session = new Session();

        session.setSessionToken(UUID.randomUUID().toString());
        session.setDeleted(false);
        session.setCreatedDate(LocalDateTime.now());
        session = updateExpirationDate(session);

        return session;
    }

    public Session updateExpirationDate(Session session) {
        if (session.getModifiedDate() != null) {
            session.setExpirationDate(session.getModifiedDate().plusDays(14));
        } else {
            session.setExpirationDate(LocalDateTime.now().plusDays(14));
        }

        return session;
    }
}