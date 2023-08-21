package com.wisepc.wisepc.model.parts.request;

import com.wisepc.wisepc.model.parts.constants.Currency;
import com.wisepc.wisepc.model.producers.Brand;
import com.wisepc.wisepc.model.producers.Model;

public record CaseCreationRequest(
        Model model,
        Brand brand,
        Long price,
        Currency currency,
        Long width,
        Long length,
        Long height
) {
}
