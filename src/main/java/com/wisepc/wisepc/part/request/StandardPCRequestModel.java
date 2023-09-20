package com.wisepc.wisepc.part.request;

import com.wisepc.wisepc.part.constants.Currency;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
abstract class StandardPCRequestModel {
    protected final Long modelId;
    protected final Long brandId;
    protected final Integer price;
    protected final Currency currency;

    public StandardPCRequestModel(Long modelId, Long brandId, Integer price, Currency currency) {
        this.modelId = modelId;
        this.brandId = brandId;
        this.price = price;
        this.currency = currency;
    }
}
