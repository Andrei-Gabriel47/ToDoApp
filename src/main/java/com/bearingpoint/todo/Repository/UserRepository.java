package com.bearingpoint.todo.Repository;

import com.bearingpoint.todo.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Integer>
{

}
