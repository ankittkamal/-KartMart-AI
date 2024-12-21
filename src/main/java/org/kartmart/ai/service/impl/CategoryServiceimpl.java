package org.kartmart.ai.service.impl;

import org.kartmart.ai.dto.CategoryDTO;
import org.kartmart.ai.entity.Category;
import org.kartmart.ai.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceimpl implements CategoryService {
    @Override
    public List<Category> getAllCategories() {
        return List.of();
    }

    @Override
    public Category getCategoryById(int id) {
        return null;
    }

    @Override
    public void createCategory(CategoryDTO categoryDTO) {

    }

    @Override
    public String deleteCategoryById(Long id) {
        
        return "";
    }
}
