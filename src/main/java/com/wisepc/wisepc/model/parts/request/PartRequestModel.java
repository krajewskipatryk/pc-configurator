package com.wisepc.wisepc.model.parts.request;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
abstract class PartRequestModel extends StandardPCRequestModel {
    protected int tdp;
}
