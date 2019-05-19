package com.system.controller;

import com.system.model.mtr_gas;
import com.system.repository.MtrGasRepository;
import com.system.service.MtrGasServiceImpl;
import com.util.Ajax;
import com.util.RestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class GasController {
    private final MtrGasRepository mtrGasRepository;

    public GasController(MtrGasRepository mtrGasRepository) {
        this.mtrGasRepository = mtrGasRepository;
    }

    @Autowired
    private MtrGasServiceImpl mtrGasService;

    @RequestMapping(value = "/gasPost", method = RequestMethod.POST)
    public @ResponseBody
    Map<String, Object> persist(@RequestParam("data") String data) throws RestException {
        return Ajax.emptyResponse();
    }

    @RequestMapping(value = "/gasGet", method = RequestMethod.GET)
    public Optional<mtr_gas> getRandomData() throws RestException {
        Optional<mtr_gas> m = mtrGasService.getData();
        return mtrGasService.getData();
    }

    @RequestMapping(value = "/gasData", method = RequestMethod.PUT)
    @ResponseBody
    public mtr_gas putRequest(@RequestBody mtr_gas mgas) throws RestException {
        return mtrGasRepository.save(mgas);
    }
}