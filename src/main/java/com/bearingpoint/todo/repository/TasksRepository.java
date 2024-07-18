package com.bearingpoint.todo.repository;

import com.bearingpoint.todo.entity.Tasks;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TasksRepository extends CrudRepository<Tasks,Integer>
{

}