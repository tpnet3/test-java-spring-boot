package main.java.controller;

import main.java.object.FirstObject;
import main.java.service.BarService;
import main.java.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// @RestController 은 스프링 컨테이너에 Restful API 로 통신하는
// Controller 를 선언하는 어노테이션입니다.
// 이 어노테이션을 선언함으로써 프레임워크가 스프링 컨테이너에 저장해둡니다.
@RestController
public class InjectExampleController {

    // 이 프로퍼티에 직접 @Autowired 할 수 있지만,
    // constructor 에 선언할 수도 있습니다.
    private FirstService firstService;
    private BarService barService;

    // constructor 에 @Autowired 를 선언하면,
    // 파라미터로 생성된 빈을 입력받습니다.
    @Autowired
    public InjectExampleController(FirstService firstService, BarService barService) {
        this.firstService = firstService;
        this.barService = barService;
    }

    // "POST /" 요청이 일어났을 때 메소드가 실행됩니다.
    @PostMapping("/")
    public String postMethod(
            // @RequestBody 어노테이션이 선언되지 않은 파라미터는
            // URI 의 Query 부분을 Object 로 Parsing 합니다.
            FirstObject queryObject,

            // @RequestBody 어노테이션이 선언된 파라미터는
            // Request 의 Body 부분을 Object 로 Parsing 합니다.
            @RequestBody FirstObject jsonBodyObject) {

        // 비즈니스 로직을 실행합니다.
        firstService.printObjects(queryObject, jsonBodyObject);

        // 필요에 따라 여러 비즈니스로직을 실행하기도 합니다.
        barService.barMethod();

        // return 값은 String 도 가능합니다.
        return "스프링 부트로 POST 메소드가 실행되었습니다!";
    }
}
