package com.system.controller;

import com.system.model.MtrGasEntity;
import com.system.service.MtrGasServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class GasController {

    private MtrGasServiceImpl mtrGasServiceImpl;

    @Autowired
    public void setMessageController(MtrGasServiceImpl mtrGasServiceImpl) {
        this.mtrGasServiceImpl = mtrGasServiceImpl;
    }

    @GetMapping
    public String list() {
        return "hello";
    }

    @GetMapping("/gas")
    public Optional<MtrGasEntity> findGas() {
        return mtrGasServiceImpl.findMtrGas();
    }
    @GetMapping("/gas2")
    public Optional<MtrGasEntity> findGas2() {
        return mtrGasServiceImpl.findMtrGas2();
    }

    @GetMapping("/gasAll")
    public List<MtrGasEntity> findAll() {
        return mtrGasServiceImpl.findAll();
    }
}