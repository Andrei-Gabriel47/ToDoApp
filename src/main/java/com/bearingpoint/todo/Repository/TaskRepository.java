package com.bearingpoint.todo.Repository;

import com.bearingpoint.todo.Model.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Task,Integer> {
}
