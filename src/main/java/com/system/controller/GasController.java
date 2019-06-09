package com.system.controller;

import com.system.model.mtr_gas;
import com.system.repository.MtrGasRepository;
import com.system.service.MtrGasServiceImpl;
import com.util.Ajax;
import com.util.RestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
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

    @Autowired
    private MtrGasRepository mtrGasRepository1;

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

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<mtr_gas> getGetList() throws RestException {
        return mtrGasRepository1.getAll();
    }

    @RequestMapping(value = "/put", method = RequestMethod.PUT)
    @ResponseBody
    public mtr_gas putRequest(@RequestBody mtr_gas mgas) throws RestException {
        return mtrGasRepository.save(mgas);
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(@RequestParam("name") String param, Model model) {
        model.addAttribute("name", param);
        return "hello test page";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(HttpServletRequest request) {
        System.out.println("ololo" + request.getServletPath());
        return "index";
    }
}