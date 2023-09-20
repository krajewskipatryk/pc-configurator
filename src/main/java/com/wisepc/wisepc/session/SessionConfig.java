package com.wisepc.wisepc.session;

import com.wisepc.wisepc.model.session.dao.SessionRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class SessionConfig {
    @Bean
    public SessionService sessionService(SessionRepository sessionRepository, SessionCreator sessionCreator, SessionUpdater sessionUpdater) {
        return new SessionServiceImpl(sessionRepository, sessionCreator, sessionUpdater);
    }

    @Bean
    public SessionCreator sessionCreator() {
        return new SessionCreator();
    }
}
