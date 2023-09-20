package com.wisepc.wisepc.model.session.dao;

import com.wisepc.wisepc.model.configurator.domain.Configuration;
import com.wisepc.wisepc.model.session.domain.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {
    Optional<Session> findBySessionToken(String sessionToken);
    Optional<Configuration> findConfigurationBySessionToken(String sessionToken);
}

