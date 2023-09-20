package com.wisepc.wisepc.part.mapper;

import com.wisepc.wisepc.model.part.domain.GraphicCard;
import com.wisepc.wisepc.part.request.GraphicCardCreationRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GraphicCardMapper {
    GraphicCardMapper instance = Mappers.getMapper(GraphicCardMapper.class);

    GraphicCard graphicCardCreationRequestToGraphicCard(GraphicCardCreationRequest graphicCardRequest);
}
