package com.wisepc.wisepc.model.part.domain;

import com.wisepc.wisepc.part.constants.HardDriveType;
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
