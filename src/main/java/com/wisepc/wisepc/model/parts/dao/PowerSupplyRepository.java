package com.wisepc.wisepc.model.parts.dao;

import com.wisepc.wisepc.model.parts.domain.PowerSupply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface PowerSupplyRepository extends JpaRepository<PowerSupply, Long> {
}
