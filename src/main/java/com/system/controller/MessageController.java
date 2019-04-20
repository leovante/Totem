package com.system.controller;

import com.system.model.MtrGasEntity;
import com.system.service.MtrGasServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("message")
public class MessageController {

    @Autowired
    private MtrGasServiceImpl mtrGasServiceImpl;

    @GetMapping
    public String list() {
        return "hello";
    }

    @GetMapping("/gas")
    public Optional<MtrGasEntity> findGas() {
        return mtrGasServiceImpl.findMtrGas();
    }
}