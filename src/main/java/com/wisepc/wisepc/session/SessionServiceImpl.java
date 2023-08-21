package com.wisepc.wisepc.session;

import com.wisepc.wisepc.configurator.model.Configuration;
import com.wisepc.wisepc.session.model.Session;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;

import java.time.LocalDateTime;

@RequiredArgsConstructor
class SessionServiceImpl implements SessionService {
    private final SessionRepository sessionRepository;
    private final SessionCreator sessionCreator;

    @Override
    public String createSession() {
        Session session = sessionCreator.buildSession();

        sessionRepository.save(session);

        return session.getSessionToken();
    }

    /**
     * TODO: Replace RuntimeException with NoDataFoundException when created
     */
    @Override
    public Boolean validateSession(String sessionToken) {
        Session session = sessionRepository.findSessionBySessionToken(sessionToken).orElseThrow(() ->
                new EmptyResultDataAccessException("No session found for session token = " + sessionToken, 1)
        );

        return LocalDateTime.now().isBefore(session.getExpirationDate());
    }

    @Override
    public Configuration getConfigurationBySessionToken(String sessionToken) {
        return sessionRepository.findConfigurationBySessionToken(sessionToken).orElseThrow(() ->
                new EmptyResultDataAccessException("No session found for session token = " + sessionToken, 1)
        );
    }
}
