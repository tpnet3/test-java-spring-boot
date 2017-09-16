package object;

import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;

public class FileObject {

    // Controller 의 @Valid 로 요청 받을 때 조건을 체크할 수 있습니다.
    // @NotNull 은 Null 일 경우 오류를 반환하도록 하고, 이와 비슷한 어노테이션이 몇가지 있습니다.
    @NotNull
    private MultipartFile file;

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "FileObject{" +
                "file=" + file +
                '}';
    }
}
