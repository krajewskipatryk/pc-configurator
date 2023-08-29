package com.wisepc.wisepc.model.parts.domain;

import com.wisepc.wisepc.model.parts.constants.HardDriveType;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Entity
@Table(name = "hard_drive")
public class HardDrive extends AbstractMemoryContainingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private HardDriveType hardDriveType;
}
