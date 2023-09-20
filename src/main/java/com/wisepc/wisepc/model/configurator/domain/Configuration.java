package com.wisepc.wisepc.model.configurator.domain;

import java.util.Set;

import com.wisepc.wisepc.model.session.domain.Session;
import com.wisepc.wisepc.model.part.domain.*;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "configuration")
public class Configuration {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "graphic_card")
    private GraphicCard graphicCard;

    @ManyToOne
    @JoinColumn(name = "processor")
    private Processor processor;

    @ManyToOne
    @JoinColumn(name = "case")
    private Case computerCase;

    @ManyToOne
    @JoinColumn(name = "power_supply")
    private PowerSupply powerSupply;

    @ManyToOne
    @JoinColumn(name = "motherboard")
    private Motherboard motherboard;

    @ManyToMany
    @JoinTable(
            name = "configuration_ram_set",
            joinColumns = { @JoinColumn(name = "ram_id") },
            inverseJoinColumns = { @JoinColumn(name = "configuration_id") }
    )
    private Set<Ram> rams;

    @ManyToMany
    @JoinTable(
            name = "configuration_hard_drive_set",
            joinColumns = { @JoinColumn(name = "hard_drive_id") },
            inverseJoinColumns = { @JoinColumn(name = "configuration_id") }
    )
    private Set<HardDrive> hardDrives;

    @OneToOne(mappedBy = "configuration")
    private Session session;
}