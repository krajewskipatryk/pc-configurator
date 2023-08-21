package com.wisepc.wisepc.model.producer.dao;

import com.wisepc.wisepc.model.producer.domain.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface ManufacturerRepository extends JpaRepository<Manufacturer, Long> {
}
