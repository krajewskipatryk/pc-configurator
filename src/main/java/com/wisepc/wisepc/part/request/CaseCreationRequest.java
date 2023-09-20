package com.wisepc.wisepc.part.request;

import com.wisepc.wisepc.part.constants.Currency;
import lombok.Getter;

@Getter
public class CaseCreationRequest extends StandardPCRequestModel {
    private final Integer width;
    private final Integer length;
    private final Integer height;

    public CaseCreationRequest(Long modelId, Long brandId, Integer price, Currency currency, Integer width, Integer length, Integer height) {
        super(modelId, brandId, price, currency);
        this.width = width;
        this.length = length;
        this.height = height;
    }
}
