package com.wisepc.wisepc.model.part.dao;

import com.wisepc.wisepc.model.part.domain.HardDrive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HardDriveRepositiory extends JpaRepository<HardDrive, Long> {
}
