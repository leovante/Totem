package com.system.repository;

import com.system.model.mtr_start;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;

@Repository
@Transactional
public interface MtrStartRepository extends JpaRepository<mtr_start, BigInteger>, CustomMtrStartRepository {


}