package main.java.object;

import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;

public class FileObject {

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
