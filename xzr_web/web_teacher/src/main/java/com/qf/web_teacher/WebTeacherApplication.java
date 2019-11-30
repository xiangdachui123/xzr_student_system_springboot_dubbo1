package com.qf.web_teacher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qf")
public class WebTeacherApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebTeacherApplication.class, args);
    }

}
