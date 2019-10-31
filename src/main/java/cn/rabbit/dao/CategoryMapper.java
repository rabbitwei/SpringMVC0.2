package cn.rabbit.dao;

import cn.rabbit.pojo.Category;
import org.springframework.stereotype.Component;

import java.util.List;

//注意方法名需要和映射配置文件的 id 名一致
public interface CategoryMapper {

    List<Category> list();
    Category get(int id);
    void update(Category category);
    void delete(Category category);
    void add(Category category);
    void alterId();
}
