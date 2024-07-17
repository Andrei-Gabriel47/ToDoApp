package com.bearingpoint.todo.Controller;

import com.bearingpoint.todo.Model.Task;
import com.bearingpoint.todo.Repository.TaskRepository;
import com.bearingpoint.todo.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/api/tasks")
@RestController
public class TaskController {
   private final TaskService taskService;


    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @GetMapping
    public Iterable<Task> getAllTasks()
    {
       return taskService.findAllTasks();
    }
    @GetMapping(path = "{Id}")
    public Optional<Task> findTaskById(@PathVariable("Id") int Id)
    {
        return taskService.findTaskById(Id);
    }
    @PostMapping
    public void addTask (@RequestBody Task task)
    {
        taskService.addTask(task);
    }
    @DeleteMapping
    public void deleteTask(@PathVariable("Id") int Id)
    {
        taskService.deleteTask(Id);
    }
    @PutMapping(path = "{Id}")
    public void updateTask(@PathVariable("Id") int Id, @RequestBody Task task)
    {
        taskService.updateTask(Id,task);
    }
}
