package com.example.demo.Service.Impl;

import com.example.demo.Dao.EmployeeMapper;
import com.example.demo.Model.Employee;
import com.example.demo.Service.EmployeeService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    EmployeeMapper employeeMapper;

    @Override

    public Employee getEmpById(Integer id) {
        return employeeMapper.getEmpById(id);
    }

    @Override
    public Integer updateEmp(Employee employee) {

        return employeeMapper.updateEmp(employee);
    }

    @Override
    public Integer insertEmp(Employee employee) {
        return employeeMapper.insertEmp(employee);
    }

    @Override
    public Integer deleteEmp(Integer id) {
    return employeeMapper.deleteEmp(id);
    }
}
