package com.system.service;

import com.system.model.MtrGasEntity;
import com.system.repository.MtrGasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class MtrGasServiceImpl {

    private MtrGasService mtrGasService;

    @Autowired/*(required = false)*/
    public void setMtrGasService(MtrGasService mtrGasService) {
        this.mtrGasService = mtrGasService;
    }

    @Transactional
    public Optional<MtrGasEntity> findMtrGas(){
        return mtrGasService.getById(0L);
    }

    @Transactional
    public MtrGasEntity findMtrGas2(){
        return mtrGasService.getOne((long) 0);
    }

    public List<MtrGasEntity> findAll(){
        return mtrGasService.findAll();
    }
}