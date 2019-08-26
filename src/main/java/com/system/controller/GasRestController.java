package com.system.controller;

import com.system.model.mtr_gas;
import com.system.repository.MtrGasRepository;
import com.system.service.MtrGasServiceImpl;
import com.util.RestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class GasRestController {

    @Autowired
    private MtrGasServiceImpl mtrGasService;

    @Autowired
    private MtrGasRepository mtrGasRepository;

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public mtr_gas putRequest(@RequestParam(name = "equip") Long equip) {
        return mtrGasService.saveRfEquipment(equip);
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<mtr_gas> findOrderedByGasidLimitedTo() throws RestException {
        return mtrGasRepository.findOrderedByGasidLimitedTo(10);
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public long getCountGas() {
        return mtrGasRepository.count();
    }

}