package org.kartmart.ai.service.impl;

import org.kartmart.ai.dto.CategoryDTO;
import org.kartmart.ai.entity.Category;
import org.kartmart.ai.repository.CategoryRepository;
import org.kartmart.ai.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoryServiceimpl implements CategoryService {

    private CategoryRepository categoryRepository;

    public CategoryServiceimpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public CategoryDTO createCategory(CategoryDTO categoryDTO) {
        Category category = mapToEntity(categoryDTO);
        Category savedCategory = categoryRepository.save(category);
        return mapToDto(savedCategory);
    }

    @Override
    public List<CategoryDTO> getAllCategories() {
        return categoryRepository.findAll().stream().map(this::mapToDto).collect(Collectors.toList());
    }

    @Override
    public CategoryDTO getCategoryById(Long id) {
        Category category = categoryRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Category Not Found"));
        return mapToDto(category);
    }

    @Override
    public CategoryDTO updateCategory(CategoryDTO categoryDTO, Long id) {
        Category category = categoryRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Category Not Found"));
        category.setCategoryName(categoryDTO.getCategoryName());
        Category updatedCategory = categoryRepository.save(category);
        return mapToDto(updatedCategory);
    }

    @Override
    public void deleteCategoryById(Long id) {
        if(!categoryRepository.existsById(id)){
            throw new IllegalArgumentException("Category Not Found");
        }
        categoryRepository.deleteById(id);
    }

    private Category mapToEntity(CategoryDTO dto){
        Category category = new Category();
        category.setCategoryId(dto.getCategoryId());
        category.setCategoryName(dto.getCategoryName());
        return category;
    }

    private CategoryDTO mapToDto(Category category){
        CategoryDTO dto = new CategoryDTO();
        dto.setCategoryId(category.getCategoryId());
        dto.setCategoryName(category.getCategoryName());
        return dto;
    }
}
