package com.bearingpoint.todo.repository;

import com.bearingpoint.todo.entity.SubTasks;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubTasksRepository extends CrudRepository<SubTasks,Integer>
{

}