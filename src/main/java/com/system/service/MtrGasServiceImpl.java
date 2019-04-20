package com.system.service;

import com.system.model.MtrGasEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class MtrGasServiceImpl {

    @Autowired
    private MtrGasService mtrGasService;

    @Transactional
    public Optional<MtrGasEntity> findMtrGas(){
        return mtrGasService.findById(0L);
    }
}