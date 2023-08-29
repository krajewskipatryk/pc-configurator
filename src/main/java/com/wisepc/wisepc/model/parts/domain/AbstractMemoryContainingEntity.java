package com.wisepc.wisepc.model.parts.domain;

import com.wisepc.wisepc.model.parts.constants.MemoryType;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MappedSuperclass
abstract class AbstractMemoryContainingEntity extends AbstractPartEntity {
    @Column(name = "memory_size")
    protected int size;

    @Column(name = "memory_type")
    @Enumerated(EnumType.STRING)
    protected MemoryType memoryType;
}
