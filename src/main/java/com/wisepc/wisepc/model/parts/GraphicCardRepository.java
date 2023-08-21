package com.wisepc.wisepc.model.parts;

import com.wisepc.wisepc.model.parts.domain.GraphicCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface GraphicCardRepository extends JpaRepository<GraphicCard, Long> {
}
