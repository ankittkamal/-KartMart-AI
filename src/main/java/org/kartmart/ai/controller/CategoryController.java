package org.kartmart.ai.controller;

import org.kartmart.ai.dto.CategoryDTO;
import org.kartmart.ai.entity.Category;
import org.kartmart.ai.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping("/category")
    public ResponseEntity<CategoryDTO> addCategory(@RequestBody CategoryDTO dto) {

        return null;
    }

    @GetMapping("/categories")
    public List<Category> getAllCategories() {
        return null;
    }

    @GetMapping("/category/{categoryId}")
    public ResponseEntity<CategoryDTO>  getCategory(@PathVariable Long id){
        return null;
    }

    @PutMapping("/category/categoryId")
    public ResponseEntity<CategoryDTO> updateCategory(@RequestBody CategoryDTO dto, @PathVariable Long id) {
        return null;
    }

    @DeleteMapping("/category/{categoryId}")
    public ResponseEntity<?> deleteCategory(@PathVariable Long categoryId) {
        return null;
    }
}
