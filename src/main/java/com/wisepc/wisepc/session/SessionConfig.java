package com.wisepc.wisepc.session;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class SessionConfig {
    @Bean
    public SessionService sessionService(SessionRepository sessionRepository) {
        return new SessionServiceImpl(sessionRepository);
    }

//    @Bean
//    public SessionCreator sessionCreationService() {
//        return new SessionCreator();
//    }
}
