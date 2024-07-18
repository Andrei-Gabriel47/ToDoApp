package com.bearingpoint.todo.service;

import com.bearingpoint.todo.repository.TasksRepository;
import com.bearingpoint.todo.entity.Tasks;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class TasksService {
    private final TasksRepository tasksRepository;

    @Autowired
    public TasksService(TasksRepository tasksRepository) {
        this.tasksRepository = tasksRepository;
    }

    public void addTask(Tasks task) {
        tasksRepository.save(task);
    }

    public List<Tasks> getAllTasks() {
        return (List<Tasks>) tasksRepository.findAll();
    }

    public Optional<Tasks> getTaskById(int id) {
        return tasksRepository.findById(id);
    }

    public void deleteTask(int id) {
        tasksRepository.deleteById(id);
    }

    public void updateTask(int id, Tasks newTask) {
        if (tasksRepository.existsById(id)) {
            tasksRepository.save(newTask);
        }
    }

}
