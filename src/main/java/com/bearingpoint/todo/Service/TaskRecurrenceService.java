package com.bearingpoint.todo.Service;

import com.bearingpoint.todo.Model.TaskRecurrence;
import com.bearingpoint.todo.Repository.TaskRecurrenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaskRecurrenceService
{
    private final TaskRecurrenceRepository taskRecurrenceRepository;

    @Autowired
    public TaskRecurrenceService(TaskRecurrenceRepository taskRecurrenceRepository) {
        this.taskRecurrenceRepository = taskRecurrenceRepository;
    }
    public Iterable<TaskRecurrence> getAllTasksRecurrence()
    {
        return taskRecurrenceRepository.findAll();
    }
    public Optional<TaskRecurrence> getTaskrecurrenceById(int Id)
    {
        return taskRecurrenceRepository.findById(Id);
    }
    public void addtaskRecurrence(TaskRecurrence taskRecurrence)
    {
        taskRecurrenceRepository.save(taskRecurrence);
    }
    public void deleteTaskRecurrence(int Id)
    {
        taskRecurrenceRepository.deleteById(Id);
    }
    public void updateTaskrecurrence(int Id, TaskRecurrence taskRecurrence)
    {
        Optional<TaskRecurrence> oldTaskRecurrence = taskRecurrenceRepository.findById(Id);
        if(oldTaskRecurrence.isPresent())
        {
            TaskRecurrence updatedTaskRecurrence = oldTaskRecurrence.get();
            updatedTaskRecurrence.setTask_Id(taskRecurrence.getTask_Id());
            updatedTaskRecurrence.setRecurrence_Type(taskRecurrence.getRecurrence_Type());
            updatedTaskRecurrence.setDue_date(taskRecurrence.getDue_date());
            updatedTaskRecurrence.setNext_Due_Date(taskRecurrence.getNext_Due_Date());
            taskRecurrenceRepository.save(updatedTaskRecurrence);
        }
    }
}
