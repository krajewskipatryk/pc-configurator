package com.wisepc.wisepc.model.parts.dao;

import com.wisepc.wisepc.model.parts.domain.GraphicCard;
import com.wisepc.wisepc.model.parts.dto.*;
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
    public CaseDto getCase(Long caseId) {
        return null;
    }

    @Override
    public void createProcessor(ProcessorCreationRequest processorRequest) {

    }

    @Override
    public ProcessorDto getProcessor(Long processorId) {
        return null;
    }

    @Override
    public void createGraphicCard(GraphicCardCreationRequest graphicCardRequest) {
        GraphicCard graphicCard = graphicCardMapper.mapGraphicCardCreationRequestToEntity(graphicCardRequest);
        graphicCardRepository.save(graphicCard);
    }

    @Override
    public GraphicCardDto getGraphicCard(Long graphicCardId) {
        return null;
    }

    @Override
    public void createMotherboard(MotherboardCreationRequest motherboardRequest) {

    }

    @Override
    public MotherboardDto getMotherboard(Long motherboardId) {
        return null;
    }

    @Override
    public void createHardDrive(HardDriveCreationRequest hardDriveRequest) {

    }

    @Override
    public HardDriveDto getHardDrive(Long hardDriveId) {
        return null;
    }

    @Override
    public void createPowerSupply(PowerSupplyCreationRequest powerSupplyRequest) {

    }

    @Override
    public PowerSupplyDto getPowerSupply(Long powerSupplyId) {
        return null;
    }

    @Override
    public void createRam(RamCreationRequest ramRequest) {

    }

    @Override
    public RamDto getRam(Long ramId) {
        return null;
    }
}
