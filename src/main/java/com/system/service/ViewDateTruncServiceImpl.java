package com.system.service;

import com.system.model.view_date_trunc;
import com.system.repository.ViewDateTruncRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ViewDateTruncServiceImpl {

    @Autowired
    private ViewDateTruncRepository viewDateTruncRepository;

    @Transactional
    public List<view_date_trunc> getData() {
        List <view_date_trunc> a = viewDateTruncRepository.getAllLimitTo();
        return a;
    }
}