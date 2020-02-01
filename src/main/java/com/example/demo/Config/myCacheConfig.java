package com.example.demo.Config;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 *配置重新定义key
 */
@Configuration
public class myCacheConfig {
    @Bean("myKeyGenerator")
    public KeyGenerator keyGenerator(){

        return new KeyGenerator(){

            @Override
            public Object generate(Object o, Method method, Object... objects) {
                return method.getName()+"["+ Arrays.asList(objects) +"]";
            }
        };

    }



}
