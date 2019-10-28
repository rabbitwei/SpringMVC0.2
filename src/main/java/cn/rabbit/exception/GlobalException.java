package cn.rabbit.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/***
 * Spring MVC 的统一异常处理， 使用注解的方式
 * 需要提供 @ControllerAdvice 和 @ExceptionHandler 注解
 * @ControllerAdvice: 可以配置basePackage下的所有controller
 * @ExceptionHandler，可以处理异常, 但是仅限于当前Controller中处理异常
 * 所以结合两者使用,就可以处理全局的异常了.
 */
@ControllerAdvice()
public class GlobalException {
    //使用注解的方式，来创建统一异常处理
    @ExceptionHandler(IOException.class)    //指定捕获的异常
    public ModelAndView defaultErrorHandler(HttpServletRequest request, Exception e)
            throws Exception {

        System.out.println("使用注解的全局异常类");
        ModelAndView mav = new ModelAndView("error");
        mav.addObject("error", e);
        mav.addObject("url", request.getRequestURL());
        return mav;
    }
}
