package com.system.repository;

import com.system.model.DomainMtrGas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class MtrGasRepositoryImpl implements MtrGasRepository {

    @Autowired
    protected JdbcOperations jdbcOperations;

    @Override
    public void persist(DomainMtrGas object) {

    }

    @Override
    public void delete(DomainMtrGas object) {

    }

    @Override
    public Set<String> getRandomData() {
        Set<String> result = new HashSet<>();
        SqlRowSet rowSet = jdbcOperations.queryForRowSet("select gasid FROM mtr_gas mg ORDER BY RANDOM() LIMIT 50;");
        while (rowSet.next()) {
            result.add(rowSet.getString("gasid"));
        }
        return result;
    }
}