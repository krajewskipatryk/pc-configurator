package com.wisepc.wisepc.model.parts.dao;

import com.wisepc.wisepc.model.parts.domain.Processor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface ProcessorRepository extends JpaRepository<Processor, Long> {
}
