package com.bearingpoint.todo.Controller;

import com.bearingpoint.todo.Model.Category;
import com.bearingpoint.todo.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RequestMapping("/api/categories")
@RestController
public class CategoryController {
    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public Iterable<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    public Optional<Category> getCategoryById(@PathVariable("id") int id) {
        return categoryService.getCategoryById(id);
    }

    @PostMapping
    public void addCategory(@RequestBody Category category) {
        categoryService.addCategory(category);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable("id") int id) {
        categoryService.deleteCategory(id);
    }

    @PutMapping("/{id}")
    public void updateCategory(@PathVariable("id") int id, @RequestBody Category category) {
        categoryService.updateCategory(id, category);
    }
}
