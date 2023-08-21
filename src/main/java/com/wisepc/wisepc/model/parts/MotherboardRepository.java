package com.wisepc.wisepc.model.parts;

import com.wisepc.wisepc.model.parts.domain.Motherboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface MotherboardRepository extends JpaRepository<Motherboard, Long> {
}
