package com.wisepc.wisepc.configurator;

import com.wisepc.wisepc.model.parts.PartDao;
import com.wisepc.wisepc.session.SessionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ConfiguratorConfig {
    @Bean
    public ConfiguratorService configuratorService(SessionService sessionService) {
        return new ConfiguratorServiceImpl(sessionService);
    }

    @Bean
    public ConfiguratorMapper configuratorMapper(ConfiguratorRepository configuratorRepository, PartDao partDao) {
        return new ConfiguratorMapper(configuratorRepository, partDao);
    }

    @Bean
    public ConfiguratorBuilder configuratorBuilder(ConfiguratorRepository configuratorRepository) {
        return new ConfiguratorBuilder(configuratorRepository);
    }
}
