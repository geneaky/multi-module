package com.example.multimoduletest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication//(scanBasePackages = {"com.example"}) //분리된 모듈의 상위 패키지 계층이 다르다면 직접 지정하여 하위 패키지까지 scan해야한다
public class MultiModuleTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultiModuleTestApplication.class, args);
    }

}
