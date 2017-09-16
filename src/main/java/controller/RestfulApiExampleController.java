package controller;

import object.FirstObject;
import org.springframework.web.bind.annotation.*;

// @RestController 은 스프링 컨테이너에 Restful API 로 통신하는
// Controller 를 선언하는 어노테이션입니다.
// 이 어노테이션을 선언함으로써 프레임워크가 스프링 컨테이너에 저장해둡니다.
@RestController
public class RestfulApiExampleController {

    // @GetMapping 은 스프링 프레임워크의 어노테이션입니다.
    // 설정한 HTTP URI 로 접속이 일어난 요청에 대해 메소드를 실행합니다.
    // PostMapping, DeleteMapping, PutMapping 등을 사용할 수 있습니다.
    @GetMapping("/")
    public FirstObject index(FirstObject firstObject) {

        // Query string 으로 만들어진 object 를 사용할 수 있습니다.
        System.out.println(firstObject.getFoo());

        // GetterSetter Object 를 return 으로 보내줄 경우 Json 형태로 자동으로 변환됩니다.
        // 클래스에 @RestController 가 선언되어있기 때문에 가능하고,
        // @Controller 를 사용할 경우 메소드에 @ResponseBody 어노테이션을 선언해줘야합니다.
        return firstObject;
    }
}
