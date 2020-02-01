package com.example.demo.Config;



import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

/**
 * 重定义错误页面
 */
@Configuration
public class ErrorPageConfig implements ErrorPageRegistrar {
    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {

        ErrorPage errorPage=new ErrorPage(HttpStatus.FORBIDDEN,"/403");
        registry.addErrorPages(errorPage);
    }
}
