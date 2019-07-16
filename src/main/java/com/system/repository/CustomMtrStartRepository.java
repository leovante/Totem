package com.system.repository;

import com.system.model.mtr_start;

import java.util.List;

public interface CustomMtrStartRepository {

    List<mtr_start> findOrderedByStartidLimitedTo(int limit);
}