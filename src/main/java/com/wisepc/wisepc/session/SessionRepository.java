package com.wisepc.wisepc.session;

import com.wisepc.wisepc.configurator.model.Configuration;
import com.wisepc.wisepc.session.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
interface SessionRepository extends JpaRepository<Session, Long> {
    Optional<Session> findBySessionToken(String sessionToken);
    Optional<Configuration> findConfigurationBySessionToken(String sessionToken);
}

