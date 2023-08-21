package com.wisepc.wisepc.model.parts.request;

import com.wisepc.wisepc.model.parts.constants.Currency;
import com.wisepc.wisepc.model.parts.constants.HardDriveType;
import com.wisepc.wisepc.model.parts.constants.MemoryType;
import lombok.Getter;

@Getter
public class HardDriveCreationRequest extends MemorizedRequestModel {
    private final HardDriveType hardDriveType;

    public HardDriveCreationRequest(
            Long modelId,
            Long brandId,
            Integer price,
            Currency currency,
            Integer tdp, Integer size, MemoryType memoryType, HardDriveType hardDriveType) {
        super(modelId, brandId, price, currency, tdp, size, memoryType);
        this.hardDriveType = hardDriveType;
    }
}
