package com.wisepc.wisepc.model.parts.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
@Entity
@Table(name = "processor")
public class Processor extends AbstractPartEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "socket")
    private String socket;

    @Column(name = "supported_chipset")
    private String supportedChipsets;

    @Column(name = "frequency")
    private Double frequency;

    @Column(name = "cores")
    private Integer cores;
}
