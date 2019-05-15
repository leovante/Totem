package com.system.repository;

import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public class MtrGasRepositoryImpl implements CustomMtrGasRepository {

    @Override
    public Set<String> fetchGasAndEquipment() {
        return null;
    }
}