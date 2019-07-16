package com.system.repository;

import com.system.model.mtr_start;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CustomMtrStartRepositoryImpl implements CustomMtrStartRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<mtr_start> findOrderedByStartidLimitedTo(int limit) {
        return entityManager.createQuery("SELECT p FROM mtr_start p ORDER BY p.startid desc",
                mtr_start.class).setMaxResults(limit).getResultList();
    }
}