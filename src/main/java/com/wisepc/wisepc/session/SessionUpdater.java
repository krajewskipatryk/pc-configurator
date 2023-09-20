package com.wisepc.wisepc.session;

import com.wisepc.wisepc.model.session.domain.Session;

import java.time.LocalDateTime;

class SessionUpdater {
    public Session updateExpirationDate(Session session) {
        if (session.getModifiedDate() != null) {
            session.setExpirationDate(session.getModifiedDate().plusDays(14));
        } else {
            session.setExpirationDate(LocalDateTime.now().plusDays(14));
        }

        return session;
    }
}
