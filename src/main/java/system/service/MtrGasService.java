package system.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import system.model.MtrGasEntity;

@Repository
public interface MtrGasService extends CrudRepository<MtrGasEntity, Long>{



}
