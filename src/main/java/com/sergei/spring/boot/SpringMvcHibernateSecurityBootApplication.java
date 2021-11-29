package com.sergei.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
public class SpringMvcHibernateSecurityBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcHibernateSecurityBootApplication.class, args);
    }

}
