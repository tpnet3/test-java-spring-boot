package com.example.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@Service
public class FileService {

    public String upload(String filePath, MultipartFile multipartFile) {

        File newFile = new File(filePath);

        if (newFile.exists()) {
            // 파일이 이미 존재할경우 실행됩니다.
            return "서버에 파일이 이미 존재합니다.";
        }

        try {
            // MultipartFile 에서 InputStream 을 가져옵니다.
            // 내용을 읽지 못할 경우 throws IOException
            InputStream inputStream = multipartFile.getInputStream();

            // 새 파일을 만듭니다.
            if ( ! newFile.createNewFile()) {
                // 파일을 만드는데 실패할 경우 실행됩니다.
                return "새 파일을 만드는데 실패했습니다.";
            }

            // 파일에 데이터를 쓸 수 있도록 OutputStream 을 가져옵니다.
            // 파일이 존재하지 않을 경우 throws FileNotFoundException
            OutputStream outputStream = new FileOutputStream(newFile);
            int read = 0;
            byte[] bytes = new byte[1024];

            // 파일을 씁니다.
            while ((read = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "파일을 만들었습니다.";
    }
}
