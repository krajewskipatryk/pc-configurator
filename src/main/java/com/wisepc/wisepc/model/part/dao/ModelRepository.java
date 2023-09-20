package com.wisepc.wisepc.model.part.dao;

import com.wisepc.wisepc.model.part.domain.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long> {
}
