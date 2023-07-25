package com.wisepc.wisepc.session;

import com.wisepc.wisepc.session.model.Session;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
class SessionServiceImpl implements SessionService {
    private final SessionRepository sessionRepository;
    private final SessionCreator sessionCreator = new SessionCreator();

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
                new RuntimeException("No session found for session token = " + sessionToken));

        return LocalDateTime.now().isBefore(session.getExpirationDate());
    }
}
