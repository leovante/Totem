package com.system.repository;

import com.system.model.DomainMtrGas;

import java.util.Set;

public interface MtrGasRepository <V extends DomainMtrGas> {
    void persist(V object);

    void delete(V object);

    Set<String> getRandomData();
}