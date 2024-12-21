package org.kartmart.ai.service;

import org.kartmart.ai.dto.CategoryDTO;
import org.kartmart.ai.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    Category getCategoryById(int id);
    void createCategory(CategoryDTO categoryDTO);
    String deleteCategoryById(Long id);
}
