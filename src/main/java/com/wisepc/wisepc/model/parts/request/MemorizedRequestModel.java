package com.wisepc.wisepc.model.parts.request;

import com.wisepc.wisepc.model.parts.constants.MemoryType;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
abstract class MemorizedRequestModel extends PartRequestModel {
    protected int size;
    protected MemoryType memoryType;
}
