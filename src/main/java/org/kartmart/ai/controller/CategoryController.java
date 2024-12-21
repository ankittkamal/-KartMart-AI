package org.kartmart.ai.controller;

import org.kartmart.ai.dto.CategoryDTO;
import org.kartmart.ai.entity.Category;
import org.kartmart.ai.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequestMapping("/v1/api/categories")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    public ResponseEntity<CategoryDTO> addCategory(@RequestBody CategoryDTO dto) {
        CategoryDTO category = categoryService.createCategory(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(category);
    }

    @GetMapping
    public ResponseEntity<List<CategoryDTO>> getAllCategories() {
        List<CategoryDTO> allCategories = categoryService.getAllCategories();
        return ResponseEntity.ok(allCategories);
    }

    @GetMapping("/{categoryId}")
    public ResponseEntity<CategoryDTO>  getCategory(@PathVariable Long categoryId){
        CategoryDTO categoryById = categoryService.getCategoryById(categoryId);
        return ResponseEntity.ok(categoryById);
    }

    @PutMapping("/{categoryId}")
    public ResponseEntity<CategoryDTO> updateCategory(@RequestBody CategoryDTO dto, @PathVariable Long categoryId) {
        CategoryDTO categoryDTO = categoryService.updateCategory(dto, categoryId);
        return ResponseEntity.ok(categoryDTO);
    }

    @DeleteMapping("/{categoryId}")
    public ResponseEntity<?> deleteCategory(@PathVariable Long categoryId) {
         categoryService.deleteCategoryById(categoryId);
         return ResponseEntity.noContent().build();
    }
}
