package main.java.service;

import org.springframework.stereotype.Service;

// @Service 어노테이션을 통해 스프링 컨테이너에 저장합니다.
@Service
public class BarService {

    public void barMethod() {

        // 비즈니스 로직을 시작합니다.
        System.out.println("BarService 의 barMethod 메소드가 실행되었습니다.");
    }
}
