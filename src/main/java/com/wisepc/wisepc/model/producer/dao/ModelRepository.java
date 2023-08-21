package com.wisepc.wisepc.model.producer.dao;

import com.wisepc.wisepc.model.producer.domain.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface ModelRepository extends JpaRepository<Model, Long> {
}
