package com.wisepc.wisepc.model.part.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Entity
@Table(name = "motherboard")
public class Motherboard extends StandardPCEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "socket")
    private String socket;

    @Column(name = "chipset")
    private String chipset;
}
