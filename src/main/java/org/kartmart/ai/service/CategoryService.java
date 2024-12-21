package org.kartmart.ai.service;

import org.kartmart.ai.dto.CategoryDTO;
import org.kartmart.ai.entity.Category;

import java.util.List;

public interface CategoryService {
    CategoryDTO createCategory(CategoryDTO categoryDTO);
    List<CategoryDTO> getAllCategories();
    CategoryDTO getCategoryById(Long id);
    CategoryDTO updateCategory(CategoryDTO categoryDTO, Long id);
    void deleteCategoryById(Long id);
}
