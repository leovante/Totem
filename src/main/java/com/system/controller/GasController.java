package com.system.controller;

import com.system.service.MtrGasService;
import com.system.service.MtrGasServiceImpl;
import com.util.Ajax;
import com.util.ExceptionHandlerController;
import com.util.RestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;
import java.util.Set;

@Controller
public class GasController extends ExceptionHandlerController {

    private static final Logger LOG = LoggerFactory.getLogger(MtrGasServiceImpl.class);

    @Autowired
    private MtrGasService mtrGasService;

    @RequestMapping(value = "/gasPost", method = RequestMethod.POST)
    public @ResponseBody
    Map<String, Object> persist(@RequestParam("data") String data) throws RestException {
        try {
            if (data == null || data.equals("")) {
                return Ajax.emptyResponse();
            }
            mtrGasService.persist(data);
            return Ajax.emptyResponse();
        } catch (Exception e) {
            throw new RestException(e);
        }
    }

    @RequestMapping(value = "/gasGet", method = RequestMethod.GET)
    public @ResponseBody
    Map<String, Object> getRandomData() throws RestException {
        try {
            Set<String> result = mtrGasService.getRandomData();
            return Ajax.successResponse(result);
        } catch (Exception e) {
            throw new RestException(e);
        }
    }

//    private MtrGasServiceImpl mtrGasServiceImpl;
//
//    @Autowired
//    public void setMessageController(MtrGasServiceImpl mtrGasServiceImpl) {
//        this.mtrGasServiceImpl = mtrGasServiceImpl;
//    }
//
//    @GetMapping
//    public String list() {
//        return "hello";
//    }
//
//    @GetMapping("/gas")
//    public Optional<MtrGasEntity> findGas() {
//        return mtrGasServiceImpl.findMtrGas();
//    }
//    @GetMapping("/gas2")
//    public Optional<DomainMtrGas> findGas2() {
//        return mtrGasServiceImpl.findMtrGas2();
//    }
//
//    @GetMapping("/gasAll")
//    public List<DomainMtrGas> findAll() {
//        return mtrGasServiceImpl.findAll();
//    }
}