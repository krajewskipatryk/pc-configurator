package com.wisepc.wisepc.model.parts;

import com.wisepc.wisepc.model.parts.domain.Case;
import com.wisepc.wisepc.model.parts.domain.GraphicCard;
import com.wisepc.wisepc.model.parts.domain.Motherboard;
import com.wisepc.wisepc.model.parts.domain.Processor;
import com.wisepc.wisepc.model.parts.domain.PowerSupply;
import com.wisepc.wisepc.model.parts.domain.HardDrive;
import com.wisepc.wisepc.model.parts.domain.Ram;
import com.wisepc.wisepc.model.parts.request.*;

public interface PartDao {
    void createCase(CaseCreationRequest caseCreationRequest);
    Case getCase(Long caseId);
    void createProcessor(ProcessorCreationRequest processorRequest);
    Processor getProcessor(Long processorId);
    void createGraphicCard(GraphicCardCreationRequest graphicCardRequest);
    GraphicCard getGraphicCard(Long graphicCardId);
    void createMotherboard(MotherboardCreationRequest motherboardRequest);
    Motherboard getMotherboard(Long motherboardId);
    void createHardDrive(HardDriveCreationRequest hardDriveRequest);
    HardDrive getHardDrive(Long hardDriveId);
    void createPowerSupply(PowerSupplyCreationRequest powerSupplyRequest);
    PowerSupply getPowerSupply(Long powerSupplyId);
    void createRam(RamCreationRequest ramRequest);
    Ram getRam(Long ramId);
}
