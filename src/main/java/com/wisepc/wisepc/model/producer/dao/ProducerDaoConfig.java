package com.wisepc.wisepc.model.producer.dao;

import org.springframework.context.annotation.Configuration;

@Configuration
class ProducerDaoConfig {
    ProducerDao producerDao(BrandRepository brandRepository, ManufacturerRepository manufacturerRepository, ModelRepository modelRepository) {
        return new ProducerDaoImpl(brandRepository, manufacturerRepository, modelRepository);
    }
}
