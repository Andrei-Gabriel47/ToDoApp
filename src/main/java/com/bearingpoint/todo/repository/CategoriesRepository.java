package com.bearingpoint.todo.repository;

import com.bearingpoint.todo.entity.Categories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CategoriesRepository extends CrudRepository<Categories,Integer>
{

}
