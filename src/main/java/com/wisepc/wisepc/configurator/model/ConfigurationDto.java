package com.wisepc.wisepc.configurator.model;

import com.wisepc.wisepc.model.parts.domain.*;

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
