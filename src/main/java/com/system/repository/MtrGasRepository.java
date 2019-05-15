package com.system.repository;

import com.system.model.mtr_gas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface MtrGasRepository extends JpaRepository<mtr_gas, Long>, CustomMtrGasRepository {

    @Query("SELECT mg FROM mtr_gas mg")
//    @Query("SELECT new GasEquipDto(mg.value, mg.datevalue) "
//            + "FROM mtr_gas mg INNER JOIN mg.rfEquipment me")
    List<mtr_gas> getAll();

    @Query("SELECT mg FROM mtr_gas mg WHERE mg.gasid=(:pType)")
    Optional<mtr_gas> getById(@Param("pType") Long id);
}