package cn.rabbit.exception;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/***
 * Spring MVC 的统一异常处理使用 xml 配置文件的方式
 * 使用配置文件的方式： 处理异常的类需要实现 HandlerExceptionResolver 接口。
 *
 */
public class GlobalExceptionUseXML implements HandlerExceptionResolver {

    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response,
                                         @Nullable Object var3, Exception e) {
        System.out.println("使用xml配置的全局异常类");
        ModelAndView mav = new ModelAndView("error");
        mav.addObject("error", e.toString() + "\n使用xml配置统一异常");
        mav.addObject("url", request.getRequestURL());
        return mav;
    }

}
