package com.bearingpoint.todo.service;

import com.bearingpoint.todo.entity.Users;
import com.bearingpoint.todo.repository.TasksRepository;
import com.bearingpoint.todo.entity.Tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
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
        Optional<Tasks> optionalTasks = tasksRepository.findById(id);
        if (optionalTasks.isPresent()) {
            Tasks existingTask = optionalTasks.get();
            existingTask.setTitle(newTask.getTitle());
            existingTask.setDescription(newTask.getDescription());
            existingTask.setCategory_id(newTask.getCategory_id());
            existingTask.setPriority_id(newTask.getPriority_id());
            existingTask.setUser(newTask.getUser());
            existingTask.setIsCompleted(newTask.getIsCompleted());
            tasksRepository.save(existingTask);
        }
    }

}
