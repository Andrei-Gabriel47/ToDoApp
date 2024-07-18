package com.bearingpoint.todo.controller;

import com.bearingpoint.todo.entity.SubTasks;
import com.bearingpoint.todo.entity.Tasks;
import com.bearingpoint.todo.service.SubTasksService;
import com.bearingpoint.todo.service.TasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("api/v1/subtask")
@RestController
public class SubTaskController {
    private final SubTasksService subTasksService;
    @Autowired
    public SubTaskController(SubTasksService subTasksService) {
        this.subTasksService = subTasksService;
    }

    @PostMapping
    public void addSubTask(@RequestBody SubTasks subtask) {
        subTasksService.addSubTask(subtask);
    }

    @GetMapping
    public List<SubTasks> getAllSubTasks() {
        return subTasksService.getAllSubTasks();
    }

    @GetMapping(path="{id}")
    public SubTasks getSubTaskById(@PathVariable("id") int id) {
        return subTasksService.getSubTaskById(id).orElse(null);
    }

    @DeleteMapping(path="{id}")
    public void deleteSubTaskById(@PathVariable("id") int id) {
        subTasksService.deleteSubTask(id);
    }

    @PutMapping(path = "{id}")
    public ResponseEntity<Void> updateSubTask(@PathVariable("id") int id, @RequestBody SubTasks SubtaskToUpdate) {
        if (subTasksService.getSubTaskById(id).isPresent()) {
            subTasksService.updateTask(id, SubtaskToUpdate);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
