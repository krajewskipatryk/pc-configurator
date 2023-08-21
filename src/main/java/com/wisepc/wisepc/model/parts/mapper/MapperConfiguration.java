package com.wisepc.wisepc.model.parts.mapper;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class MapperConfiguration {

    @Bean
    GraphicCardMapper graphicCardMapper() {
        return new GraphicCardMapper();
    }
}
