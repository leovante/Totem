package com.system.service;

import java.util.List;

public interface CustomMtrGasService<T> {

    void delete(T entity);

    List<T> getEmployeesMaxSalary();
}
