package com.wisepc.wisepc.configurator.model;

import java.util.List;

public record ComputerUpdateRequest(
    Long processorId,
    Long graphicCardId,
    List<Long> hardDriveIds,
    List<Long> ramIds,
    Long caseId,
    Long powerSupplyId,
    Long motherboardId
) {
}
