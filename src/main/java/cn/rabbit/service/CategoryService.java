package cn.rabbit.service;

import cn.rabbit.pojo.Category;

import java.util.List;

public interface CategoryService {
    List<Category> list();
    Category get(int id);
    void update(Category category);
    void delete(Category category);
    void add(Category category);
}
