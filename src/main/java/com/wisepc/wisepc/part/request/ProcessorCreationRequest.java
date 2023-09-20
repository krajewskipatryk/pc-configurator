package com.wisepc.wisepc.part.request;

import com.wisepc.wisepc.part.constants.Currency;
import lombok.Getter;

@Getter
public class ProcessorCreationRequest extends PartRequestModel {
    private final String socket;
    private final String supportedChipsets;
    private final Double frequency;
    private final Integer cores;

    public ProcessorCreationRequest(
                                    Long modelId,
                                    Long brandId,
                                    Integer price,
                                    Currency currency,
                                    Integer tdp,
                                    String socket,
                                    String supportedChipsets,
                                    Double frequency,
                                    Integer cores) {

        super(modelId, brandId, price, currency, tdp);
        this.socket = socket;
        this.supportedChipsets = supportedChipsets;
        this.frequency = frequency;
        this.cores = cores;
    }
}
