package com.wisepc.wisepc.model.parts;

import com.wisepc.wisepc.model.parts.domain.Case;
import com.wisepc.wisepc.model.parts.domain.GraphicCard;
import com.wisepc.wisepc.model.parts.domain.Motherboard;
import com.wisepc.wisepc.model.parts.domain.Processor;
import com.wisepc.wisepc.model.parts.domain.PowerSupply;
import com.wisepc.wisepc.model.parts.domain.HardDrive;
import com.wisepc.wisepc.model.parts.domain.Ram;
import com.wisepc.wisepc.model.parts.mapper.GraphicCardMapper;
import com.wisepc.wisepc.model.parts.request.*;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class PartDaoImpl implements PartDao {

    private final CaseRepository caseRepository;
    private final GraphicCardRepository graphicCardRepository;
    private final ProcessorRepository processorRepository;
    private final HardDriveRepositiory hardDriveRepositiory;
    private final MotherboardRepository motherboardRepository;
    private final RamRepository ramRepository;
    private final PowerSupplyRepository powerSupplyRepository;
    private final GraphicCardMapper graphicCardMapper;

    @Override
    public void createCase(CaseCreationRequest caseCreationRequest) {

    }

    @Override
    public Case getCase(Long caseId) {
        return null;
    }

    @Override
    public void createProcessor(ProcessorCreationRequest processorRequest) {

    }

    @Override
    public Processor getProcessor(Long processorId) {
        return null;
    }

    @Override
    public void createGraphicCard(GraphicCardCreationRequest graphicCardRequest) {

    }

    @Override
    public GraphicCard getGraphicCard(Long graphicCardId) {
        return null;
    }

    @Override
    public void createMotherboard(MotherboardCreationRequest motherboardRequest) {

    }

    @Override
    public Motherboard getMotherboard(Long motherboardId) {
        return null;
    }

    @Override
    public void createHardDrive(HardDriveCreationRequest hardDriveRequest) {

    }

    @Override
    public HardDrive getHardDrive(Long hardDriveId) {
        return null;
    }

    @Override
    public void createPowerSupply(PowerSupplyCreationRequest powerSupplyRequest) {

    }

    @Override
    public PowerSupply getPowerSupply(Long powerSupplyId) {
        return null;
    }

    @Override
    public void createRam(RamCreationRequest ramRequest) {

    }

    @Override
    public Ram getRam(Long ramId) {
        return null;
    }
}
