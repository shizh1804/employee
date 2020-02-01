package com.example.demo.Dao;

import com.example.demo.Model.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;


@Mapper
public interface EmployeeMapper {

        public Employee getEmpById(Integer id);

        public Integer updateEmp(Employee employee);

        public Integer insertEmp(Employee employee);

        public Integer deleteEmp(Integer id);

}
