package com.example.demo.Service;

import com.example.demo.Model.Employee;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


public interface EmployeeService {

    public Employee getEmpById(Integer id);

    public Integer updateEmp(Employee employee);

    public Integer insertEmp(Employee employee);

    public Integer deleteEmp(Integer id);




}
