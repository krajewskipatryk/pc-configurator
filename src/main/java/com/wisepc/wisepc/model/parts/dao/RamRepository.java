package com.wisepc.wisepc.model.parts.dao;

import com.wisepc.wisepc.model.parts.domain.Ram;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface RamRepository extends JpaRepository<Ram, Long> {
}
