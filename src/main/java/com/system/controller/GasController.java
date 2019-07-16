package com.system.controller;

import com.system.model.mtr_gas;
import com.system.model.mtr_start;
import com.system.repository.MtrGasRepository;
import com.system.repository.MtrStartRepository;
import com.system.service.MtrGasServiceImpl;
import com.system.service.MtrStartServiceImpl;
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
    private MtrStartServiceImpl mtrStartService;

    @Autowired
    private MtrGasRepository mtrGasRepository;

    @Autowired
    private MtrStartRepository mtrStartRepository;

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    @ResponseBody
    public mtr_gas putRequest(@RequestParam(name = "equip") Long equip) throws RestException {
        return mtrGasService.saveRfEquipment(equip);
    }

    @RequestMapping(value = "/start", method = RequestMethod.PUT)
    @ResponseBody
    public mtr_start putStart() throws RestException {
        return mtrStartService.saveStart();
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

    @RequestMapping(value = "/getStart", method = RequestMethod.GET)
    @ResponseBody
    public List<mtr_start> getStart() {
        return mtrStartRepository.findOrderedByStartidLimitedTo(10);
    }
}