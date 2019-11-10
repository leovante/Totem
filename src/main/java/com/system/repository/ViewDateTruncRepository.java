package com.system.repository;

import com.system.model.view_date_trunc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.List;

@Repository
@Transactional
public interface ViewDateTruncRepository extends JpaRepository<view_date_trunc, BigInteger> {

    @Query(nativeQuery = true, value = "SELECT * FROM postgres.public.view_date_trunc limit 10")
    List<view_date_trunc> getAllLimitTo();
}