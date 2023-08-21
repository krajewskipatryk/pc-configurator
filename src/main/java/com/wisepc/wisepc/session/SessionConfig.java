package com.wisepc.wisepc.session;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class SessionConfig {
    @Bean
    public SessionService sessionService(SessionRepository sessionRepository, SessionCreator sessionCreator) {
        return new SessionServiceImpl(sessionRepository, sessionCreator);
    }

    @Bean
    public SessionCreator sessionCreator() {
        return new SessionCreator();
    }
}
