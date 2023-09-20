package com.wisepc.wisepc.model.configurator.dao;

import com.wisepc.wisepc.model.configurator.domain.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfiguratorRepository extends JpaRepository<Configuration, Long> {
}
