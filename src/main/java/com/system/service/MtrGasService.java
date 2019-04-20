package com.system.service;

import com.system.model.MtrGasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MtrGasService extends JpaRepository<MtrGasEntity, Long> {

}