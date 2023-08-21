package com.wisepc.wisepc.model.parts.request;

import com.wisepc.wisepc.model.parts.constants.Currency;
import com.wisepc.wisepc.model.parts.constants.MemoryType;
import lombok.Getter;

@Getter
public class GraphicCardCreationRequest extends MemorizedRequestModel {
    private final Long manufacturerId;

    public GraphicCardCreationRequest(Long modelId, Long brandId, Integer price, Currency currency, Integer tdp, Integer size, MemoryType memoryType, Long manufacturerId) {
        super(modelId, brandId, price, currency, tdp, size, memoryType);
        this.manufacturerId = manufacturerId;
    }
}
