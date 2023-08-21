package com.wisepc.wisepc.model.parts.mapper;

import com.wisepc.wisepc.model.parts.domain.GraphicCard;
import com.wisepc.wisepc.model.parts.request.GraphicCardCreationRequest;

public class GraphicCardMapper {
    public GraphicCard mapGraphicCardCreationRequestToEntity(GraphicCardCreationRequest graphicCardRequest) {
        GraphicCard mappedGraphicCardEntity = new GraphicCard();
        mappedGraphicCardEntity.setBrand(graphicCardRequest.getBrand());
        mappedGraphicCardEntity.setModel(graphicCardRequest.getModel());
        mappedGraphicCardEntity.setManufacturer(graphicCardRequest.getManufacturer());
        mappedGraphicCardEntity.setPrice(graphicCardRequest.getPrice());
        mappedGraphicCardEntity.setCurrency(graphicCardRequest.getCurrency());
        mappedGraphicCardEntity.setSize(graphicCardRequest.getSize());
        mappedGraphicCardEntity.setMemoryType(graphicCardRequest.getMemoryType());
        mappedGraphicCardEntity.setTdp(graphicCardRequest.getTdp());

        return mappedGraphicCardEntity;
    }
}
