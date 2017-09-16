package service;

import org.springframework.stereotype.Service;

// @Service 어노테이션을 통해 스프링 컨테이너에 저장합니다.
@Service
public class FirstService {

    public void printObjects(Object... objects) {

        // 비즈니스 로직이 실행됩니다.
        for (Object object : objects) {

            // Object 를 콘솔에 출력합니다.
            System.out.println(object);
        }
    }
}
