package com.system.repository;

import com.system.model.mtr_gas;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Tuple;
import java.util.List;
import java.util.Set;

@Repository
public class CustomMtrGasRepositoryImpl implements CustomMtrGasRepository {

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

    @Override
    public void getDateTrunc(){
        Tuple tuple = entityManager
                .createQuery(
                        "select date_trunc(p.date) as date " +
                                "from mtr_gas p " +
                                "where p.id = :postId", Tuple.class)
                .setParameter("postId", 1L)
                .getSingleResult();
        System.out.println(tuple);

        /*assertEquals(
                "High-Performance Java Persistence",
                tuple.get("title")
        );

        assertEquals(
                Timestamp.valueOf(
                        LocalDateTime.of(2018, 11, 23, 0, 0, 0)
                ),
                tuple.get("creation_date")
        );*/
    }
}