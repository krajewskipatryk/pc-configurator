package com.wisepc.wisepc.configurator.dto;

import java.util.List;

public record ConfiguratorUpdateRequest(
    Long processorId,
    Long graphicCardId,
    List<Long> hardDriveIds,
    List<Long> ramIds,
    Long caseId,
    Long powerSupplyId,
    Long motherboardId
) {
}
