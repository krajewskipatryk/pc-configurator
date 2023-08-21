package com.wisepc.wisepc.model.parts.dao;

import com.wisepc.wisepc.model.parts.domain.Case;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface CaseRepository extends JpaRepository<Case, Long> {
}
