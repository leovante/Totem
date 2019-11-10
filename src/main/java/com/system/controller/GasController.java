package com.system.controller;

import com.system.model.view_date_trunc;
import com.system.repository.MtrGasRepository;
import com.system.repository.MtrStartRepository;
import com.system.service.ViewDateTruncServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class GasController {

    @Autowired
    private MtrGasRepository mtrGasRepository;

    @Autowired
    private ViewDateTruncServiceImpl viewDateTruncService;

    @Autowired
    private MtrStartRepository mtrStartRepository;

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String index(Model model)   {
        String message = (mtrGasRepository.count() == 0) ? "0" : String.valueOf(mtrGasRepository.count() * 10);
        String power = (mtrStartRepository.count() == 0) ? "0" : String.valueOf(mtrStartRepository.count());
        List<view_date_trunc> data = viewDateTruncService.getData();
        model.addAttribute("message", message);
        model.addAttribute("power", power);
        model.addAttribute("data", data);
        return "index";
    }
}