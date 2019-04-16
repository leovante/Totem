package system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import system.model.MtrGasEntity;

import java.util.Optional;

@Component
public class MtrGasServiceImpl {

    @Autowired
    private MtrGasService mtrGasService;

    @Transactional
    public Optional<MtrGasEntity> findMtrGas(){
        return mtrGasService.findById(0L);
    }
//    @Transactional
//    public void findMtrGas(){
//        Optional<MtrGasEntity> mtrGasOptional = mtrGasService.findById(Long.valueOf(0));
//    }
}
