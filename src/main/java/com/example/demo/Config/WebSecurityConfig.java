//package com.example.demo.Config;
//
//import com.example.demo.MyUserDetailService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
////注释两个注解 @Configuration @EnableWebSecurity就在项目中不起作用
////@Configuration
////@EnableWebSecurity
//public class WebSecurityConfig  extends WebSecurityConfigurerAdapter {
//
//    @Bean
//    public PasswordEncoder createPasswordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//    @Autowired
//    MyUserDetailService myUserDetailService;
//
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////            auth.inMemoryAuthentication()//认证信息存储到内存中
////                    .passwordEncoder(new BCryptPasswordEncoder())
////                    .withUser("user").password(new BCryptPasswordEncoder().encode("123456"))
////                    .authorities("PRODUCT_ADD","PRODUCT_UPDATE")
////            .and().withUser("admin").password(new BCryptPasswordEncoder().encode("123456")).roles("vip","vip1");
//
////            auth.jdbcAuthentication().dataSource().passwordEncoder(new BCryptPasswordEncoder()).withUser("niu")
////                    .password(new BCryptPasswordEncoder().encode("123456")).roles("","");
//        auth.userDetailsService(myUserDetailService);
//
//    }
//
//
//    protected void configure(HttpSecurity http) throws Exception {
//
//        http.authorizeRequests()
//                .antMatchers("/product/add").hasAuthority("PRODUCT_ADD")
//                .antMatchers("/product/update").hasAuthority("PRODUCT_UPDATE")
//                .antMatchers("/product/list").hasAuthority("PRODUCT_LIST")
//                .antMatchers("/product/delete").hasAuthority("PRODUCT_DELETE")
//                .antMatchers("/login").permitAll()
//                .antMatchers("/**").fullyAuthenticated()
//                .and()
//                .formLogin()
//                .and().csrf().disable();
//        http.logout().logoutUrl("/").logoutSuccessUrl("/");
//
//    }
//
//
//
//
//}
