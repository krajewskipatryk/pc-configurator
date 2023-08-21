package com.wisepc.wisepc.model.producer.dao;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class ProducerDaoImpl implements ProducerDao {
    private final BrandRepository brandRepository;
    private final ManufacturerRepository manufacturerRepository;
    private final ModelRepository modelRepository;
}
