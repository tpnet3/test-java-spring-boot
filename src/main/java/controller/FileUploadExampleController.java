package main.java.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public class FileUploadExampleController {

    @PostMapping("/upload")
    public String upload(
            @RequestParam("file") MultipartFile multipart
            /*@Valid FileObject fileObject,*/
            /*BindingResult result, ModelMap model*/) {

        System.out.println(multipart.getName());
        /*
        System.out.println(result);
        System.out.println(model);
        */

        return "업로드 되었습니다.";
    }
}
