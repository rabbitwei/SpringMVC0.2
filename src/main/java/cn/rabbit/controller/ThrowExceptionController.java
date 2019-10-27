package cn.rabbit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

/***
 * 专门用来抛出异常的类
 */
@Controller
public class ThrowExceptionController {

    @RequestMapping("/exception")
    public void throwException() throws IOException {
        if (true)
            throw new IOException();
    }
}
