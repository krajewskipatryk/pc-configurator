package com.wisepc.wisepc.model.producer.dao;

import com.wisepc.wisepc.model.producer.domain.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface BrandRepository extends JpaRepository<Brand, Long> {
}
