package com.system.service;

import com.system.model.mtr_start;
import com.system.repository.MtrStartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class MtrStartServiceImpl {

    @Autowired
    private MtrStartRepository mtrStartRepository;

    @Transactional
    public mtr_start saveStart() {
        UUID uuid = UUID.randomUUID();
        mtr_start ms = new mtr_start();
        ms.setUuid(uuid);
        mtrStartRepository.save(ms);
        return ms;
    }
}