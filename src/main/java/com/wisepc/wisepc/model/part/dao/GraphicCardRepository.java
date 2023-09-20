package com.wisepc.wisepc.model.part.dao;

import com.wisepc.wisepc.model.part.domain.GraphicCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GraphicCardRepository extends JpaRepository<GraphicCard, Long> {
}
