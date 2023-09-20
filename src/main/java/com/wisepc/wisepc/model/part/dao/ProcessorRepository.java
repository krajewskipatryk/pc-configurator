package com.wisepc.wisepc.model.part.dao;

import com.wisepc.wisepc.model.part.domain.Processor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessorRepository extends JpaRepository<Processor, Long> {
}
