package com.bearingpoint.todo.controller;

import com.bearingpoint.todo.entity.Tasks;
import com.bearingpoint.todo.service.TasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class TasksController {
    private final TasksService tasksService;

    @Autowired
    public TasksController(TasksService tasksService) {
        this.tasksService = tasksService;
    }

    @PostMapping
    public void addTask(@RequestBody Tasks task) {
        tasksService.addTask(task);
    }

    @GetMapping
    public List<Tasks> getAllTasks() {
        return tasksService.getAllTasks();
    }

    @GetMapping(path="{id}")
    public Tasks getTaskById(@PathVariable("id") int id) {
        return tasksService.getTaskById(id).orElse(null);
    }

    @DeleteMapping(path="{id}")
    public void deleteTaskById(@PathVariable("id") int id) {
        tasksService.deleteTask(id);
    }

    @PutMapping(path="{id}")
    public void updateTask(@PathVariable("id") int id, @RequestBody Tasks taskToUpdate) {
        tasksService.updateTask(id, taskToUpdate);
    }
}
