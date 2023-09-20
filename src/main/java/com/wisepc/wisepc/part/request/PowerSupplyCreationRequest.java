package com.wisepc.wisepc.part.request;

import com.wisepc.wisepc.part.constants.Currency;
import com.wisepc.wisepc.part.constants.Modularity;
import lombok.Getter;

@Getter
public class PowerSupplyCreationRequest extends StandardPCRequestModel {
    private final Integer power;
    private final Modularity modularity;

    public PowerSupplyCreationRequest(Long modelId, Long brandId, Integer price, Currency currency, Integer power, Modularity modularity) {
        super(modelId, brandId, price, currency);
        this.power = power;
        this.modularity = modularity;
    }
}