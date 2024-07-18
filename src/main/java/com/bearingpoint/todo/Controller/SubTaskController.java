package com.bearingpoint.todo.Controller;

import com.bearingpoint.todo.Model.SubTask;
import com.bearingpoint.todo.Service.SubTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/api/subtasks")
@RestController
public class SubTaskController
{
    private final SubTaskService subTaskService;

    @Autowired
    public SubTaskController(SubTaskService subTaskService) {
        this.subTaskService = subTaskService;
    }
    @GetMapping
    public Iterable<SubTask> getAllsubTasks()
    {
        return subTaskService.getAllSubtasks();
    }
    @GetMapping(path = "{Id}")
    public Optional<SubTask> getSubTaskById(@PathVariable("Id") int Id)
    {
      return   subTaskService.getSubTaskById(Id);
    }
    @PostMapping
    public void addSubtask(@RequestBody SubTask subTask)
    {
        subTaskService.addSubTask(subTask);
    }
    @DeleteMapping(path = "{Id}")
    public void deleteSubtask(@PathVariable("Id") int Id)
    {
        subTaskService.deleteSubTaskById(Id);
    }
    @PutMapping(path = "{Id}")
    public void updateSubtask(@PathVariable("Id") int Id, @RequestBody SubTask subTask)
    {
        subTaskService.updateSubTask(Id,subTask);
    }
}
