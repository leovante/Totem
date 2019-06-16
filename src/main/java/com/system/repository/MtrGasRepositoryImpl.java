package com.system.repository;

import com.system.model.mtr_gas;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Set;

@Repository
public class MtrGasRepositoryImpl implements CustomMtrGasRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Set<String> fetchGasAndEquipment() {
        return null;
    }

    @Override
    public List<mtr_gas> findOrderedByGasidLimitedTo(int limit) {
        return entityManager.createQuery("SELECT p FROM mtr_gas p ORDER BY p.gasid desc",
                mtr_gas.class).setMaxResults(limit).getResultList();
    }
}