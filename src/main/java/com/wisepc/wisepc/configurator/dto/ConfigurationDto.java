package com.wisepc.wisepc.configurator.dto;

import com.wisepc.wisepc.model.part.domain.*;

import java.util.Set;

public record ConfigurationDto(
        Long id,
        GraphicCard graphicCard,
        Processor processor,
        Case computerCase,
        PowerSupply powerSupply,
        Motherboard motherboard,
        Set<Ram> rams,
        Set<HardDrive> hardDrives
) {
}
