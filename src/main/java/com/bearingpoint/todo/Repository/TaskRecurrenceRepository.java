package com.bearingpoint.todo.Repository;

import com.bearingpoint.todo.Model.TaskRecurrence;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRecurrenceRepository extends CrudRepository<TaskRecurrence,Integer> {
}
