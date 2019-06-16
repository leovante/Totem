package com.system.repository;

import com.system.model.mtr_gas;

import java.util.List;
import java.util.Set;

public interface CustomMtrGasRepository {

    public Set<String> fetchGasAndEquipment();

    List<mtr_gas> findOrderedByGasidLimitedTo(int limit);
}