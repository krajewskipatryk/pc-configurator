package com.wisepc.wisepc.model.parts.request;

import com.wisepc.wisepc.model.parts.constants.Currency;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
abstract class PartRequestModel extends StandardPCRequestModel {
    protected final Integer tdp;

    public PartRequestModel(Long modelId, Long brandId, Integer price, Currency currency, Integer tdp) {
        super(modelId, brandId, price, currency);
        this.tdp = tdp;
    }
}
