package com.example.demo.Config;

import com.example.demo.Model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

import java.net.UnknownHostException;

/**
 * 改变默认的序列化规则
 */
@Configuration
public class myRedisConfig {

    @Bean
    public RedisTemplate<Object,Employee> redisTemplates(RedisConnectionFactory redisConnectionFactory) throws UnknownHostException {
            RedisTemplate<Object,Employee> employeeRedisTemplate=new RedisTemplate<>();
            employeeRedisTemplate.setConnectionFactory(redisConnectionFactory);
           Jackson2JsonRedisSerializer<Employee> ser = new Jackson2JsonRedisSerializer<Employee>(Employee.class);
            employeeRedisTemplate.setDefaultSerializer(ser);

        return employeeRedisTemplate;
    }






}
