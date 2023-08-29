package com.wisepc.wisepc.configurator;

import com.wisepc.wisepc.session.SessionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ConfiguratorConfig {
    @Bean
    public ConfiguratorService configuratorService(SessionService sessionService, ConfiguratorUpdater configuratorUpdater, ConfiguratorCreator configuratorCreator) {
        return new ConfiguratorServiceImpl(sessionService, configuratorUpdater, configuratorCreator);
    }

    @Bean
    public ConfiguratorMapper configuratorMapper() {
        return new ConfiguratorMapper();
    }

    @Bean
    public ConfiguratorUpdater configuratorUpdater(ConfiguratorMapper configuratorMapper) {
        return new ConfiguratorUpdater(configuratorMapper);
    }
}
