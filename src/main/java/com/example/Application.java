package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 어플리케이션이 처음 시작되는 클래스입니다.
// @SpringBootApplication 은 스프링 부트 어플리케이션임을 선언하는 어노테이션입니다.
// @PropertySource 는 스프링 부트에 대한 properties 파일을 불러옵니다.
@SpringBootApplication
//@PropertySource(value = "classpath:application.properties")
public class Application {

    // 처음 시작되는 메소드입니다.
    public static void main(String[] args) {

        // 스프링 어플리케이션을 현재의 클래스를 바탕으로 실행합니다.
        // 기본 포트 번호는 8080 이고, application.properties 파일에서 설정할 수 있습니다.
        SpringApplication.run(Application.class, args);
    }
}