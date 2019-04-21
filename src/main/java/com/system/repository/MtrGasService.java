package com.system.repository;

import com.system.model.MtrGasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
public interface MtrGasService extends JpaRepository<MtrGasEntity, Long> {

    @Query("SELECT mtrId FROM MtrGasEntity mg WHERE mg.mtrId=(:pType)")
    Optional<MtrGasEntity> getById(@Param("pType") Long id);
}