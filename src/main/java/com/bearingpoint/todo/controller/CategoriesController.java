package com.bearingpoint.todo.controller;

import com.bearingpoint.todo.entity.Categories;
import com.bearingpoint.todo.entity.Users;
import com.bearingpoint.todo.service.CategoriesService;
import com.bearingpoint.todo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("api/v1/categories")
@RestController
public class CategoriesController {
    private final CategoriesService categoriesService;
    @Autowired
    public CategoriesController(CategoriesService categoriesService) {
        this.categoriesService = categoriesService;
    }

    @PostMapping
    public void addUser(@RequestBody Categories Category){
        categoriesService.addUser(Category);
    }

    @GetMapping
    public List<Categories> getAllCategories(){
        return categoriesService.getAllCategories();
    }

    @GetMapping(path="{id}")
    public Categories getCategoriesById(@PathVariable("id") int id){
        return categoriesService.getCategoriesById(id).orElse(null);
    }

    @DeleteMapping(path="{id}")
    public void deleteCategoriesById(@PathVariable("id") int id){
        categoriesService.deleteCategories(id);
    }

    @PutMapping(path="{id}")
    public ResponseEntity<Void> updateUser(@PathVariable("id") int id, @RequestBody Categories CategoriesToUpdate){
        if (categoriesService.getCategoriesById(id).isPresent()) {
            categoriesService.updateUser(id, CategoriesToUpdate);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
