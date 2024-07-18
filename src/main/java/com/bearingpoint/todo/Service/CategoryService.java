package com.bearingpoint.todo.Service;

import com.bearingpoint.todo.Model.Category;
import com.bearingpoint.todo.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService
{
    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Iterable<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Optional<Category> getCategoryById(int id) {
        return categoryRepository.findById(id);
    }

    public void addCategory(Category category) {
        categoryRepository.save(category);
    }

    public void deleteCategory(int id) {
        categoryRepository.deleteById(id);
    }

    public void updateCategory(int id, Category category) {
        Optional<Category> oldCategory = categoryRepository.findById(id);
        if (oldCategory.isPresent()) {
            Category updatedCategory = oldCategory.get();
            updatedCategory.setName(category.getName());
            categoryRepository.save(updatedCategory);
        }
    }
}
