package com.bearingpoint.todo.Controller;

import com.bearingpoint.todo.Model.TaskRecurrence;
import com.bearingpoint.todo.Service.TaskRecurrenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/api/taskrec")
@RestController
public class TaskRecurrenceController {
  private final TaskRecurrenceService taskRecurrenceService;

  @Autowired
    public TaskRecurrenceController(TaskRecurrenceService taskRecurrenceService) {
        this.taskRecurrenceService = taskRecurrenceService;
    }

    @GetMapping
    public Iterable<TaskRecurrence> getAllTaskRec()
    {
        return taskRecurrenceService.getAllTasksRecurrence();
    }
    @GetMapping(path = "{Id}")
    public Optional<TaskRecurrence> getTaskRecById(@PathVariable("Id") int Id)
    {
        return taskRecurrenceService.getTaskrecurrenceById(Id);
    }
    @PostMapping
    public void addTaskRec(@RequestBody TaskRecurrence taskRecurrence)
    {
        taskRecurrenceService.addtaskRecurrence(taskRecurrence);
    }
    @DeleteMapping(path = "{Id}")
    public void deleteTaskRec(@PathVariable("Id") int Id)
    {
        taskRecurrenceService.deleteTaskRecurrence(Id);
    }
    @PutMapping(path = "{Id}")
    public void updateTaskRec(@PathVariable("Id") int Id, @RequestBody TaskRecurrence taskRecurrence)
    {
        taskRecurrenceService.updateTaskrecurrence(Id,taskRecurrence);
    }
}
