package com.bearingpoint.todo.service;

import com.bearingpoint.todo.entity.Categories;
import com.bearingpoint.todo.entity.Users;
import com.bearingpoint.todo.repository.CategoriesRepository;
import com.bearingpoint.todo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CategoriesService {
    private final CategoriesRepository categoriesRepository;
    @Autowired
    public CategoriesService(CategoriesRepository categoriesRepository) {
        this.categoriesRepository = categoriesRepository;
    }

    public void addUser(Categories categories){

        categoriesRepository.save(categories);
    }

    public List<Categories> getAllCategories(){
        return  (List<Categories>) categoriesRepository.findAll();
    }

    public Optional<Categories> getCategoriesById(int id){
        return categoriesRepository.findById(id);
    }

    public void deleteCategories(int id){
        categoriesRepository.deleteById(id);
    }

    public void updateUser(int id, Categories newCategory){
        Optional<Categories> optionalCategories = categoriesRepository.findById(id);
        if (optionalCategories.isPresent()) {
            Categories existingCategories = optionalCategories.get();
            existingCategories.setName(newCategory.getName());
            categoriesRepository.save(existingCategories);
        }
    }
}
