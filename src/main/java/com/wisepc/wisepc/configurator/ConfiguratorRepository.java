package com.wisepc.wisepc.configurator;

import com.wisepc.wisepc.configurator.model.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface ConfiguratorRepository extends JpaRepository<Configuration, Long> {
}
