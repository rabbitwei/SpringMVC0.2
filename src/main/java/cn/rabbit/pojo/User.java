package cn.rabbit.pojo;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Component
public class User {
    private int id;

    //名称的长度请限制在2到30个字符
    @Size(min = 2, max = 30, message = "{user.name.length.error}")
    private String name;

    @NotNull(message = "{user.password.is.notnull}")
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
