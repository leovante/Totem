package com.system.controller;

import com.system.model.mtr_gas;
import com.system.repository.MtrGasRepository;
import com.system.service.MtrGasServiceImpl;
import com.util.RestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class GasController {

    @Autowired
    private MtrGasServiceImpl mtrGasService;

    @Autowired
    private MtrGasRepository mtrGasRepository;

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    @ResponseBody
    public mtr_gas putRequest(@RequestParam(name = "equip") Long equip) throws RestException {
        return mtrGasService.saveRfEquipment(equip);
    }

    @RequestMapping(value = "/start", method = RequestMethod.PUT)
    @ResponseBody
    public mtr_gas putStart(@RequestParam(name = "equip") Long equip) throws RestException {
        return mtrGasService.saveRfEquipment(equip);
        // TODO: 01.07.2019 переделать под start
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<mtr_gas> findOrderedByGasidLimitedTo() throws RestException {
        return mtrGasRepository.findOrderedByGasidLimitedTo(10);
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @ResponseBody
    public long getCountGasid() {
        return mtrGasRepository.count();
    }

}