package com.system.service;

import com.system.model.MtrGasEntity;
import com.system.repository.MtrGasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class MtrGasServiceImpl {

    private MtrGasRepository mtrGasRepository;

    @Autowired/*(required = false)*/
    public void setMtrGasRepository(MtrGasRepository mtrGasRepository) {
        this.mtrGasRepository = mtrGasRepository;
    }

    @Transactional
    public Optional<MtrGasEntity> findMtrGas(){
        return mtrGasRepository.getById(0L);
    }

    @Transactional
    public Optional<MtrGasEntity> findMtrGas2(){
        return mtrGasRepository.findById(Long.valueOf(0));
    }

    public List<MtrGasEntity> findAll(){
        return mtrGasRepository.findAll();
    }
}