package com.wisepc.wisepc.model.parts;

import com.wisepc.wisepc.model.parts.domain.HardDrive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface HardDriveRepositiory extends JpaRepository<HardDrive, Long> {
}