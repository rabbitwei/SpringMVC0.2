package cn.rabbit.pojo;

import org.springframework.web.multipart.MultipartFile;

public class UploadFile {
    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

    private MultipartFile image;
}
