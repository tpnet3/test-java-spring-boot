package controller;

import object.FileObject;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;

@RestController
public class FileUploadExampleController {

    // @Valid 어노테이션과 해당 오브젝트의 @NotNull 과 같은 조건으로
    // 오브젝트를 체크할 수 있습니다.
    @PostMapping("/upload")
    public String upload(@Valid FileObject fileObject,
                         BindingResult result) {

        // @Valid 를 통과했는지 여부를 확인할 수 있습니다.
        if (result.hasErrors()) {
            System.out.println();
            System.out.println(fileObject);
            System.out.println();
            System.out.println(result);
            System.out.println();
            return "오류가 발생했습니다.";
        }

        // @Valid 가 통과되었다면 다음 코드를 실행합니다.
        System.out.println();
        System.out.println(fileObject);
        System.out.println();
        System.out.println(result);
        System.out.println();

        // 파일에 대한 정보를 가져올 수 있습니다.
        MultipartFile file = fileObject.getFile();
        System.out.println(file.getName());
        System.out.println(file.getContentType());
        System.out.println(file.getSize());

        return "업로드 되었습니다.";
    }
}
