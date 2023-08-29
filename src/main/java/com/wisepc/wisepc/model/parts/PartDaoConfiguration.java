package com.wisepc.wisepc.model.parts;

import com.wisepc.wisepc.model.parts.mapper.GraphicCardMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class PartDaoConfiguration {

    @Bean
    public PartQueryDao partQueryDao(
            CaseRepository caseRepository,
            GraphicCardRepository graphicCardRepository,
            ProcessorRepository processorRepository,
            RamRepository ramRepository,
            PowerSupplyRepository powerSupplyRepository,
            MotherboardRepository motherboardRepository,
            HardDriveRepositiory hardDriveRepositiory,
            GraphicCardMapper graphicCardMapper
            ) {
        return new PartDaoImpl(
                caseRepository,
                graphicCardRepository,
                processorRepository,
                hardDriveRepositiory,
                motherboardRepository,
                ramRepository,
                powerSupplyRepository,
                graphicCardMapper);
    }

    @Bean
    public PartCreationDao partCreationDao(
            CaseRepository caseRepository,
            GraphicCardRepository graphicCardRepository,
            ProcessorRepository processorRepository,
            RamRepository ramRepository,
            PowerSupplyRepository powerSupplyRepository,
            MotherboardRepository motherboardRepository,
            HardDriveRepositiory hardDriveRepositiory,
            GraphicCardMapper graphicCardMapper
    ) {
        return new PartDaoImpl(
                caseRepository,
                graphicCardRepository,
                processorRepository,
                hardDriveRepositiory,
                motherboardRepository,
                ramRepository,
                powerSupplyRepository,
                graphicCardMapper);
    }
}
