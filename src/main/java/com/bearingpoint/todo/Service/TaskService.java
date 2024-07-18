package com.bearingpoint.todo.Service;

import com.bearingpoint.todo.Model.Task;
import com.bearingpoint.todo.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService
{
    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Iterable<Task> findAllTasks()
    {
        return taskRepository.findAll();
    }
    public Optional<Task> findTaskById(int Id)
    {
        return taskRepository.findById(Id);
    }
    public void addTask(Task task)
    {
        taskRepository.save(task);
    }
    public void deleteTask(int Id)
    {
        taskRepository.deleteById(Id);
    }
    public void updateTask(int Id, Task task)
    {
        Optional<Task> oldtask = taskRepository.findById(Id);
        if(oldtask.isPresent())
        {
            Task updatedTask = oldtask.get();
            updatedTask.setUser_Id(task.getUser_Id());
            updatedTask.setCompleted(task.isCompleted());
            updatedTask.setCategory_Id(task.getCategory_Id());
            updatedTask.setTitle(task.getTitle());
            updatedTask.setDescription(task.getDescription());
            updatedTask.setPriority_Id(task.getPriority_Id());
            taskRepository.save(updatedTask);
        }
    }
}
