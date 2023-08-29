package com.wisepc.wisepc.configurator.model;

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
