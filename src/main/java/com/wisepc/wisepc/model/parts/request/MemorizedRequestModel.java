package com.wisepc.wisepc.model.parts.request;

import com.wisepc.wisepc.model.parts.constants.Currency;
import com.wisepc.wisepc.model.parts.constants.MemoryType;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
abstract class MemorizedRequestModel extends PartRequestModel {
    protected final Integer size;
    protected final MemoryType memoryType;

    public MemorizedRequestModel(Long modelId, Long brandId, Integer price, Currency currency, Integer tdp, Integer size, MemoryType memoryType) {
        super(modelId, brandId, price, currency, tdp);
        this.size = size;
        this.memoryType = memoryType;
    }
}
