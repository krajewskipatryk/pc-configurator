package com.wisepc.wisepc.model.parts.dao;

import com.wisepc.wisepc.model.parts.dto.*;
import com.wisepc.wisepc.model.parts.request.*;

public interface PartDao {
    void createCase(CaseCreationRequest caseCreationRequest);
    CaseDto getCase(Long caseId);
    void createProcessor(ProcessorCreationRequest processorRequest);
    ProcessorDto getProcessor(Long processorId);
    void createGraphicCard(GraphicCardCreationRequest graphicCardRequest);
    GraphicCardDto getGraphicCard(Long graphicCardId);
    void createMotherboard(MotherboardCreationRequest motherboardRequest);
    MotherboardDto getMotherboard(Long motherboardId);
    void createHardDrive(HardDriveCreationRequest hardDriveRequest);
    HardDriveDto getHardDrive(Long hardDriveId);
    void createPowerSupply(PowerSupplyCreationRequest powerSupplyRequest);
    PowerSupplyDto getPowerSupply(Long powerSupplyId);
    void createRam(RamCreationRequest ramRequest);
    RamDto getRam(Long ramId);
}
