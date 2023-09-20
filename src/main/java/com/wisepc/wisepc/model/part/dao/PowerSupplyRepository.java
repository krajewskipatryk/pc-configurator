package com.wisepc.wisepc.model.part.dao;

import com.wisepc.wisepc.model.part.domain.PowerSupply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PowerSupplyRepository extends JpaRepository<PowerSupply, Long> {
}
