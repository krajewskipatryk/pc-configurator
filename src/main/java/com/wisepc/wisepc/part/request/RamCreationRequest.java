package com.wisepc.wisepc.part.request;

import com.wisepc.wisepc.part.constants.Currency;
import com.wisepc.wisepc.part.constants.MemoryType;
import lombok.Getter;

@Getter
public class RamCreationRequest extends MemorizedRequestModel {
    public RamCreationRequest(Long modelId, Long brandId, Integer price, Currency currency, Integer tdp, Integer size, MemoryType memoryType) {
        super(modelId, brandId, price, currency, tdp, size, memoryType);
    }
}