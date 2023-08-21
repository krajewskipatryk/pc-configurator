package com.wisepc.wisepc.model.parts.domain;

import com.wisepc.wisepc.model.parts.constants.Modularity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Entity
@Table(name = "power_supply")
public class PowerSupply extends StandardPCEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "power")
    private int power;

    @Column(name = "modularity")
    @Enumerated(EnumType.STRING)
    private Modularity modularity;
}
