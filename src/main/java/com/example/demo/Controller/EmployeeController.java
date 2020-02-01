package com.example.demo.Controller;

import com.example.demo.Model.Employee;
import com.example.demo.Service.EmployeeService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@ResponseBody
public class EmployeeController {
    @Resource
    EmployeeService employeeService;


    /**
     * 缓存
     * @param id
     * @return
     */
    @RequestMapping("/{id}")
    @Cacheable(value = "emp",key="#id")
    public Employee getEmp(@PathVariable("id") Integer id){

    Employee employee=employeeService.getEmpById(id);
      System.out.println("查询"+id+"号员工");

        return employee;
    }

    /**
     * 总是执行
     * 既调用方法又更新缓存
     * @param employee
     * @return
     */

    @RequestMapping("/update")
    @CachePut(value = "emp",key="#result.id")
    public Employee updateEmp(Employee employee){
        System.out.println("update:"+employee);
        employeeService.updateEmp(employee);
        return employee;
    }

    @RequestMapping("/delete/{id}")
    @CacheEvict(value = "emp",/*keyGenerator = "myKeyGenerator"*/allEntries =true )
    public String deleteEmp(@PathVariable("id") Integer id){

        System.out.println("删除"+id+"号员工");
        return "sucess";
    }


}
