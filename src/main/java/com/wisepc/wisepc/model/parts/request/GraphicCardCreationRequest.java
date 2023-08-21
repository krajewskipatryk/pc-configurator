package com.wisepc.wisepc.model.parts.request;

import com.wisepc.wisepc.model.producers.Manufacturer;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
public class GraphicCardCreationRequest extends MemorizedRequestModel {
    private Long manufacturerId;
}
