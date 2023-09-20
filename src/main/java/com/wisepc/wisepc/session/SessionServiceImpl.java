package com.wisepc.wisepc.session;

import com.wisepc.wisepc.model.configurator.domain.Configuration;
import com.wisepc.wisepc.model.session.dao.SessionRepository;
import com.wisepc.wisepc.model.session.domain.Session;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class SessionServiceImpl implements SessionService {
    private final SessionRepository sessionRepository;
    private final SessionCreator sessionCreator;
    private final SessionUpdater sessionUpdater;

    @Override
    public Session createSession() {
        Session session = sessionCreator.buildSession();

        return sessionRepository.save(session);
    }

    @Override
    public Boolean validateSessionExist(String sessionToken) {
        return getSessionEntityBySessionToken(sessionToken) != null;
    }

    @Override
    public Configuration getConfigurationBySessionToken(String sessionToken) {
        return sessionRepository.findConfigurationBySessionToken(sessionToken).orElse(null);
    }

    private Session getSessionEntityBySessionToken(String sessionToken) {
        return sessionRepository.findBySessionToken(sessionToken).orElse(null);
    }
}
