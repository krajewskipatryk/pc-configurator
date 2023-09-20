package com.wisepc.wisepc.part.mapper;

import com.wisepc.wisepc.model.part.domain.Processor;
import com.wisepc.wisepc.part.request.ProcessorCreationRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProcessorMapper {
    ProcessorMapper instance = Mappers.getMapper(ProcessorMapper.class);

    Processor processorCreationRequestToProcessor(ProcessorCreationRequest processorCreationRequest);
}
