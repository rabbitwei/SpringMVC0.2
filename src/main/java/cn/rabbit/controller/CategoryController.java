package cn.rabbit.controller;

import cn.rabbit.pojo.Category;
import cn.rabbit.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CategoryController {

    //@Autowired
    @Resource
    private CategoryService categoryService;

    @GetMapping("/categories")
    public String listCategory(Model model) {
        List<Category> categories = categoryService.list();

        //使用 Model 来讲数据发送到页面
        model.addAttribute("cs", categories);
        return "listCategory";
    }

    @DeleteMapping("/categories/{id}")
    public String deleteCategory(Category category) {
        categoryService.delete(category);
        return "redirect:/categories";
    }

    @PostMapping("/categories")
    public String addCategory(Category category) {
        categoryService.add(category);
        return "redirect:/categories";
    }

    @GetMapping("/categories/{id}")
    public String getCategory(@PathVariable("id")int id, Model model) {
        Category category = categoryService.get(id);
        model.addAttribute("category", category);
        return "editCategory";
    }

    @PutMapping("/categories/{id}")
    public String updateCategory(Category category) {
        categoryService.update(category);
        return "redirect:/categories";
    }
}
