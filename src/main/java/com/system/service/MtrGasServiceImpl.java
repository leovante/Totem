package com.system.service;

import com.system.model.mtr_gas;
import com.system.repository.MtrGasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class MtrGasServiceImpl {

    @Autowired
    private MtrGasRepository mtrGasRepository;

    @Transactional
    public Optional<mtr_gas> getData() {
        return mtrGasRepository.findById((long) 18);
    }
}