package com.wisepc.wisepc.model.part.dao;

import com.wisepc.wisepc.model.part.domain.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {
}
