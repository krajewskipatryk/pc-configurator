package com.wisepc.wisepc.model.parts.request;

import com.wisepc.wisepc.model.parts.constants.Currency;
import com.wisepc.wisepc.model.producers.Brand;
import com.wisepc.wisepc.model.producers.Model;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
abstract class StandardPCRequestModel {
    protected Long modelId;
    protected Long brandId;
    protected Integer price;
    protected Currency currency;
}
