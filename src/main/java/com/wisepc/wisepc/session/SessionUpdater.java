package com.wisepc.wisepc.session;

import com.wisepc.wisepc.session.model.Session;

import java.time.LocalDateTime;

public class SessionUpdater {
    public Session updateExpirationDate(Session session) {
        if (session.getModifiedDate() != null) {
            session.setExpirationDate(session.getModifiedDate().plusDays(14));
        } else {
            session.setExpirationDate(LocalDateTime.now().plusDays(14));
        }

        return session;
    }
}
