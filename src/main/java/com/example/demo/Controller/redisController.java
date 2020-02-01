package com.example.demo.Controller;

import com.example.demo.Model.Employee;
import com.example.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class redisController {

    @Autowired
    StringRedisTemplate stringRedisTemplate;//操作字符串的
    @Autowired
    RedisTemplate redisTemplate;//操作对象的
    @Autowired
    RedisTemplate<Object, Employee> employeeRedisTemplate;
    @Autowired
    EmployeeService employeeService;
    /**stringRedisTemplate.opsForValue()(字符串)
     * stringRedisTemplate.opsForList()(列表)
     * stringRedisTemplate.opsForHash()(散列)
     *   stringRedisTemplate.opsForSet()集合
     */

    @RequestMapping("/test")
    public void test(){
//取值
//   String msg= stringRedisTemplate.opsForValue().get("msg");
//      System.out.println(msg);

        //存值
//        stringRedisTemplate.opsForValue().append("msg","hello");

//        stringRedisTemplate.opsForList().leftPush("mylist","a");
//        stringRedisTemplate.opsForList().leftPush("mylist","b");

 //保存对象
        employeeRedisTemplate.opsForValue().set("emp.01", employeeService.getEmpById(1))  ;
    }



}
