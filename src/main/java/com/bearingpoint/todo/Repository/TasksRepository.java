package com.bearingpoint.todo.Repository;

import com.bearingpoint.todo.entity.Tasks;
import com.bearingpoint.todo.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TasksRepository extends CrudRepository<Tasks,Integer>
{

}