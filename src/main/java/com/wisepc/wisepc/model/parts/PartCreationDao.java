package com.wisepc.wisepc.model.parts;

import com.wisepc.wisepc.model.parts.request.CaseCreationRequest;
import com.wisepc.wisepc.model.parts.request.GraphicCardCreationRequest;
import com.wisepc.wisepc.model.parts.request.HardDriveCreationRequest;
import com.wisepc.wisepc.model.parts.request.MotherboardCreationRequest;
import com.wisepc.wisepc.model.parts.request.PowerSupplyCreationRequest;
import com.wisepc.wisepc.model.parts.request.ProcessorCreationRequest;
import com.wisepc.wisepc.model.parts.request.RamCreationRequest;

interface PartCreationDao {
    void createCase(CaseCreationRequest caseCreationRequest);
    void createProcessor(ProcessorCreationRequest processorRequest);
    void createGraphicCard(GraphicCardCreationRequest graphicCardRequest);
    void createMotherboard(MotherboardCreationRequest motherboardRequest);
    void createHardDrive(HardDriveCreationRequest hardDriveRequest);
    void createPowerSupply(PowerSupplyCreationRequest powerSupplyRequest);
    void createRam(RamCreationRequest ramRequest);
}
