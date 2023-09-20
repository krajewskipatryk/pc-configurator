package com.wisepc.wisepc.model.part.dao;

import com.wisepc.wisepc.model.part.domain.Case;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaseRepository extends JpaRepository<Case, Long> {
}
