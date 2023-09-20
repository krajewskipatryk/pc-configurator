package com.wisepc.wisepc.model.part.domain;

import com.wisepc.wisepc.part.constants.Modularity;
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
    private Integer power;

    @Column(name = "modularity")
    @Enumerated(EnumType.STRING)
    private Modularity modularity;
}
