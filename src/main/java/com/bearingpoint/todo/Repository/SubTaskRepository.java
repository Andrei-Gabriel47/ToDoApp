package com.bearingpoint.todo.Repository;

import com.bearingpoint.todo.Model.SubTask;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubTaskRepository extends CrudRepository<SubTask,Integer> {
}
