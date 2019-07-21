package com.system.controller;

import com.system.model.mtr_start;
import com.system.repository.MtrStartRepository;
import com.system.service.MtrStartServiceImpl;
import com.util.RestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class StartController {

    @Autowired
    private MtrStartServiceImpl mtrStartService;

    @Autowired
    private MtrStartRepository mtrStartRepository;

    @RequestMapping(value = "/start", method = RequestMethod.PUT)
    @ResponseBody
    public mtr_start putStart() throws RestException {
        return mtrStartService.saveStart();
    }

    @RequestMapping(value = "/getStart", method = RequestMethod.GET)
    @ResponseBody
    public List<mtr_start> getStart() {
        return mtrStartRepository.findOrderedByStartidLimitedTo(10);
    }

    @RequestMapping(value = "/countStart", method = RequestMethod.GET)
    @ResponseBody
    public long getCountStart() {
        return mtrStartRepository.count();
    }
}