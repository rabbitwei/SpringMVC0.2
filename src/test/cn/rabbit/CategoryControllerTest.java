package cn.rabbit;

import cn.rabbit.pojo.Category;
import cn.rabbit.service.CategoryService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")

public class CategoryControllerTest {
    @Autowired
    private CategoryService categoryService;

    @Test
    @Before
    @After
    public void listCategory() {
        System.out.println(categoryService.list());
    }
    @Test
    public void addCategory() {
        Category category = new Category();
        category.setName("test");
        categoryService.add(category);
    }
    @Test
    public void updateCategory() {
        Category c = new Category();
        c.setId(24);
        c.setName("testUpdate");
        categoryService.update(c);
    }
    @Test
    public void delteCategory() {
        Category c = new Category();
        c.setId(24);
        c.setName("testUpdate");
        categoryService.delete(c);
    }
    @Test
    public void getCategory() {
        System.out.println(categoryService.get(12));
    }
}
