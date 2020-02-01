package com.example.demo.Dao.Impl;

import com.example.demo.Dao.EmployeeMapper;
import com.example.demo.Model.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;


public class EmployeeMapperImpl implements EmployeeMapper {
        @Autowired
        EmployeeMapper employeeMapper;

    public Employee getEmpById(Integer id){
        return  employeeMapper.getEmpById(id);
    }

    public Integer updateEmp(Employee employee){
        return employeeMapper.updateEmp(employee);
    }

    public Integer insertEmp(Employee employee){
        return employeeMapper.insertEmp(employee);
    }

    public Integer deleteEmp(Integer id){
        return employeeMapper.deleteEmp(id);
    }



}
