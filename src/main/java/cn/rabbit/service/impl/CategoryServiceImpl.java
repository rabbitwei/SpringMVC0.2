package cn.rabbit.service.impl;

import cn.rabbit.mapper.CategoryMapper;
import cn.rabbit.pojo.Category;
import cn.rabbit.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    //@Autowired
    @Resource
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> list() {
        return categoryMapper.list();
    }

    @Override
    public Category get(int id) {
        return categoryMapper.get(id);
    }

    @Override
    public void update(Category category) {
        categoryMapper.update(category);
    }

    @Override
    public void delete(Category category) {
        categoryMapper.delete(category);
    }


    @Override
    public void add(Category category) {
        categoryMapper.alterId();
        categoryMapper.add(category);
    }
}
