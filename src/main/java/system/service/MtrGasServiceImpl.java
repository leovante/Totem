package system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import system.model.MtrGasEntity;

import java.util.Optional;

@Service
public class MtrGasServiceImpl {

    @Autowired
    private MtrGasService mtrGasService;

    @Transactional
    public void findMtrGas(){
        Optional<MtrGasEntity> mtrGasOptional = mtrGasService.findById(Long.valueOf(0));
    }
}
