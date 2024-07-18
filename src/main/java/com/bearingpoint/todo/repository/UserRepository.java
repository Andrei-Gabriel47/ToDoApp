package com.bearingpoint.todo.repository;


import com.bearingpoint.todo.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Users,Integer>
{

}