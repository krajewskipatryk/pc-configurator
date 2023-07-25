package com.wisepc.wisepc.session.domain;

import com.wisepc.wisepc.session.model.Session;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
public class SessionServiceImpl extends SessionFactory implements SessionService {
    private final SessionRepository sessionRepository;

    @Override
    public String createSession() {
        Session session = buildSession();

        sessionRepository.save(session);

        return session.getSessionToken();
    }

    /**
     * TODO: Replace RuntimeException with NoDataFoundException when created
     */
    @Override
    public Boolean validateSession(String sessionToken) {
        Session session = sessionRepository.findSessionBySessionToken(sessionToken).orElseThrow(() ->
                new RuntimeException("No session found for session token = " + sessionToken));

        return LocalDateTime.now().isBefore(session.getExpirationDate());
    }
}
