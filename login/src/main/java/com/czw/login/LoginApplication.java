package com.czw.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoginApplication {
    private static final Logger LOG = LoggerFactory.getLogger(LoginApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(LoginApplication.class, args);
        LOG.info("创建成功: http://localhost:9000");
    }

}
