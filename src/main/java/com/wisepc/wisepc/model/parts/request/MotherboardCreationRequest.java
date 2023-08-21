package com.wisepc.wisepc.model.parts.request;

import com.wisepc.wisepc.model.parts.constants.Currency;
import lombok.Getter;

@Getter
public class MotherboardCreationRequest extends StandardPCRequestModel {
    private final String socket;
    private final String chipset;

    public MotherboardCreationRequest(Long modelId, Long brandId, Integer price, Currency currency, String socket, String chipset) {
        super(modelId, brandId, price, currency);
        this.socket = socket;
        this.chipset = chipset;
    }
}
