package com.wisepc.wisepc.model.part.dao;

import com.wisepc.wisepc.model.part.domain.Ram;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RamRepository extends JpaRepository<Ram, Long> {
}
