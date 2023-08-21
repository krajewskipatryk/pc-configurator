package com.wisepc.wisepc.model.parts.request;

import com.wisepc.wisepc.model.parts.constants.Currency;
import lombok.Getter;

@Getter
public class CaseCreationRequest extends StandardPCRequestModel {
    private final Long width;
    private final Long length;
    private final Long heigh;

    public CaseCreationRequest(Long modelId, Long brandId, Integer price, Currency currency, Long width, Long length, Long heigh) {
        super(modelId, brandId, price, currency);
        this.width = width;
        this.length = length;
        this.heigh = heigh;
    }
}
