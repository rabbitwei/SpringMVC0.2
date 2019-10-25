package cn.rabbit.controller;

import cn.rabbit.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@Validated
public class ValidationController {
    //Controller需要在校验的参数上添加@Validation注解…拿到BindingResult对象…

    @RequestMapping("/validation")
    //@Validated作用就是将pojo内的注解数据校验规则(@NotNull等)生效，
    // 如果没有该注解的声明，pojo内有注解数据校验规则也不会生效

    //BindingResult对象用来获取校验失败的信息(@NotNull中的message)，与@Validated注解必须配对使用，一前一后
    public String validation(@Valid User user, BindingResult bindingResult, Model model) {

        List<ObjectError> allErrors = bindingResult.getAllErrors();
        for (ObjectError allError : allErrors) {
            System.out.println(allError.getDefaultMessage());
        }
        model.addAttribute("errors", allErrors);

        return "index";
    }
}
