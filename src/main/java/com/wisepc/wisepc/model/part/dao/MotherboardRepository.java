package com.wisepc.wisepc.model.part.dao;

import com.wisepc.wisepc.model.part.domain.Motherboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotherboardRepository extends JpaRepository<Motherboard, Long> {
}
