package com.system.controller;

import com.system.repository.MtrGasRepository;
import com.system.repository.MtrStartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class GasController {

    @Autowired
    private MtrGasRepository mtrGasRepository;

    @Autowired
    private MtrStartRepository mtrStartRepository;

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String index(Model model)   {
        String message = (mtrGasRepository.count() == 0) ? "0" : String.valueOf(mtrGasRepository.count() * 10);

        String power = (mtrStartRepository.count() == 0) ? "0" : String.valueOf(mtrStartRepository.count());

        model.addAttribute("message", message);
        model.addAttribute("power", power);
        return "index";
    }
}