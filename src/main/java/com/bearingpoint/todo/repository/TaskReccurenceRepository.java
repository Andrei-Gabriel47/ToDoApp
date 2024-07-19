package com.bearingpoint.todo.repository;

import com.bearingpoint.todo.entity.TaskReccurence;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskReccurenceRepository extends CrudRepository<TaskReccurence,Integer>
{

}
