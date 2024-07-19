package com.bearingpoint.todo.controller;

import com.bearingpoint.todo.entity.TaskReccurence;
import com.bearingpoint.todo.entity.Tasks;
import com.bearingpoint.todo.service.TaskReccurenceService;
import com.bearingpoint.todo.service.TasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/taskreccurence")
@RestController
public class TaskReccurenceController {
    private final TaskReccurenceService taskReccurenceService;

    public TaskReccurenceController(TaskReccurenceService taskReccurenceService) {
        this.taskReccurenceService = taskReccurenceService;
    }

    @PostMapping
    public void addTask(@RequestBody TaskReccurence taskReccurence) {
        taskReccurenceService.addTaskReccurence(taskReccurence);
    }

    @GetMapping
    public List<TaskReccurence> getAlltaskReccurence() {
        return taskReccurenceService.getAllTaskReccurence();
    }

    @GetMapping(path="{id}")
    public TaskReccurence gettaskReccurenceById(@PathVariable("id") int id) {
        return taskReccurenceService.getTaskReccurenceById(id).orElse(null);
    }

    @DeleteMapping(path="{id}")
    public void deletetaskReccurenceById(@PathVariable("id") int id) {
        taskReccurenceService.deleteTask(id);
    }

    @PutMapping(path = "{id}")
    public ResponseEntity<Void> updatetaskReccurence(@PathVariable("id") int id, @RequestBody TaskReccurence taskReccurenceToUpdate) {
        if (taskReccurenceService.getTaskReccurenceById(id).isPresent()) {
            taskReccurenceService.updateTask(id, taskReccurenceToUpdate);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
