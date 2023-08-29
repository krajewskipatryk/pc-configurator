package com.wisepc.wisepc.model.parts;

import com.wisepc.wisepc.model.parts.domain.Case;
import com.wisepc.wisepc.model.parts.domain.GraphicCard;
import com.wisepc.wisepc.model.parts.domain.Motherboard;
import com.wisepc.wisepc.model.parts.domain.Processor;
import com.wisepc.wisepc.model.parts.domain.PowerSupply;
import com.wisepc.wisepc.model.parts.domain.HardDrive;
import com.wisepc.wisepc.model.parts.domain.Ram;
import com.wisepc.wisepc.model.parts.request.*;

public interface PartQueryDao {
    Case getCase(Long caseId);
    Processor getProcessor(Long processorId);
    GraphicCard getGraphicCard(Long graphicCardId);
    Motherboard getMotherboard(Long motherboardId);
    HardDrive getHardDrive(Long hardDriveId);
    PowerSupply getPowerSupply(Long powerSupplyId);
    Ram getRam(Long ramId);
}
