package cn.rabbit.controller;

import cn.hutool.core.util.RandomUtil;
import cn.rabbit.pojo.UploadFile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
public class UploadFileController {

    @RequestMapping("/uploadFile")
    public ModelAndView upload(HttpServletRequest request, UploadFile file) throws IOException {
        String newName = RandomUtil.randomString(5);
        String newFileName = newName + ".jpg";

        //System.out.print(newFileName);

        //System.out.print(request.getServletContext().getRealPath("/images"));
        File newFile = new File(request.getServletContext().getRealPath("../upload"), newFileName);
        newFile.getParentFile().mkdirs();
        file.getImage().transferTo(newFile);

        ModelAndView mav = new ModelAndView("show");
        mav.addObject("fileName", newFileName);
        return mav;
    }
}
