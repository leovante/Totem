package com;

import com.util.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication/*(scanBasePackages = {"com.system.model","com.system.service"})*/
//@EntityScan("com.system.model")
//@ComponentScan({"com.system.controller"})
//@EnableJpaRepositories("com.system.service")
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
        SpringApplication.run(new Class<?>[]{Application.class, AppConfig.class}, args);
    }
}