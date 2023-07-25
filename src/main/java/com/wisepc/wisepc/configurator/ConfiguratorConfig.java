package com.wisepc.wisepc.configurator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ConfiguratorConfig {
    @Bean
    public ConfiguratorService configuratorService() {
        return new ConfiguratorServiceImpl();
    }

    public ConfiguratorMapper configuratorMapper() {
        return new ConfiguratorMapper();
    }
}
