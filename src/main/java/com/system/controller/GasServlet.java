package com.system.controller;

import com.system.model.mtr_gas;
import com.system.repository.MtrGasRepository;
import com.system.service.MtrGasServiceImpl;
import com.util.Ajax;
import com.util.RestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@Controller
public class GasServlet {

    @Autowired
    private MtrGasServiceImpl mtrGasService;

    @Autowired
    private MtrGasRepository mtrGasRepository;


    @RequestMapping(value = "/gasPost", method = RequestMethod.POST)
    public @ResponseBody
    Map<String, Object> persist(@RequestParam("data") String data) throws RestException {
        return Ajax.emptyResponse();
    }

    @RequestMapping(value = "/gasGet", method = RequestMethod.GET)
    public Map<String, Object> getRandomData() throws RestException {
        Optional<mtr_gas> m = mtrGasService.getData();
        return Ajax.successResponse(mtrGasService.getData());
    }

    @GetMapping({"/test"})
    public String test() {
        return "test";
    }
}