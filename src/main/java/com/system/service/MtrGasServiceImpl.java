package com.system.service;

import com.system.repository.MtrGasRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class MtrGasServiceImpl implements MtrGasService {

    //    private MtrGasRepository mtrGasRepository;
//
//    @Autowired/*(required = false)*/
//    public void setMtrGasRepository(MtrGasRepository mtrGasRepository) {
//        this.mtrGasRepository = mtrGasRepository;
//    }
//
//    @Transactional
//    public Optional<MtrGasEntity> findMtrGas(){
//        return mtrGasRepository.getById(0L);
//    }
//
//    @Transactional
//    public Optional<DomainMtrGas> findMtrGas2(){
//        return mtrGasRepository.findById(Long.valueOf(0));
//    }
//
//    public List<DomainMtrGas> findAll(){
//        return mtrGasRepository.findAll();
//    }
    private static final Logger LOG = LoggerFactory.getLogger(MtrGasServiceImpl.class);

    @Autowired
    private MtrGasRepository mtrGasRepository;

    @Override
    public boolean persist(String problem) {
        return false;
    }

    @Override
    public Set getRandomData() {
        return mtrGasRepository.getRandomData();
    }
}