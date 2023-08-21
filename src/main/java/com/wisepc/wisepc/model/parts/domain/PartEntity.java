package com.wisepc.wisepc.model.parts.domain;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MappedSuperclass
abstract class PartEntity extends StandardPCEntity {
    @Column(name = "tdp")
    protected int tdp;
}
