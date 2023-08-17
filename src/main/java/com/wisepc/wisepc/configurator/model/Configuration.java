package com.wisepc.wisepc.configurator.model;

import com.wisepc.wisepc.model.parts.Case;
import com.wisepc.wisepc.model.parts.GraphicCard;
import com.wisepc.wisepc.model.parts.HardDrive;
import com.wisepc.wisepc.model.parts.Motherboard;
import com.wisepc.wisepc.model.parts.PowerSupply;
import com.wisepc.wisepc.model.parts.Processor;
import com.wisepc.wisepc.model.parts.Ram;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Builder
@Table(name = "configuration")
public class Configuration {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "graphic_card")
    @Column(name = "graphic_card")
    private GraphicCard graphicCard;

    @ManyToOne
    @JoinColumn(name = "processor")
    @Column(name = "processor")
    private Processor processor;

    @ManyToOne
    @JoinColumn(name = "case")
    @Column(name = "case")
    private Case computerCase;

    @ManyToOne
    @JoinColumn(name = "power_supply")
    @Column(name = "power_supply")
    private PowerSupply powerSupply;

    @ManyToOne
    @JoinColumn(name = "motherboard")
    @Column(name = "motherboard")
    private Motherboard motherboard;

    @ManyToMany
    @JoinTable(
            name = "configuration_ram_set",
            joinColumns = { @JoinColumn(name = "ram_id") },
            inverseJoinColumns = { @JoinColumn(name = "configuration_id") }
    )
    @Column(name = "ram_set")
    private Set<Ram> ram;

    @ManyToMany
    @JoinTable(
            name = "configuration_hard_drive_set",
            joinColumns = { @JoinColumn(name = "hard_drive_id") },
            inverseJoinColumns = { @JoinColumn(name = "configuration_id") }
    )
    @Column(name = "hard_drive_set")
    private Set<HardDrive> hardDrive;
}
