package com.bearingpoint.todo.Service;

import com.bearingpoint.todo.Model.SubTask;
import com.bearingpoint.todo.Repository.SubTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SubTaskService {
    private final SubTaskRepository subTaskRepository;

    @Autowired
    public SubTaskService(SubTaskRepository subTaskRepository) {
        this.subTaskRepository = subTaskRepository;
    }


    public Iterable<SubTask> getAllSubtasks()
    {
        return subTaskRepository.findAll();
    }

    public Optional<SubTask> getSubTaskById(int Id)
    {
        return subTaskRepository.findById(Id);
    }
    public void addSubTask( SubTask subTask)
    {
        subTaskRepository.save(subTask);
    }
    public void deleteSubTaskById(int Id)
    {
        subTaskRepository.deleteById(Id);
    }
    public void updateSubTask(int Id, SubTask subTask)
    {
        Optional<SubTask> oldsubtask = subTaskRepository.findById(Id);
        if(oldsubtask.isPresent())
        {
            SubTask updatedsubtask = oldsubtask.get();
            updatedsubtask.setTitle(subTask.getTitle());
            updatedsubtask.setDescription(subTask.getDescription());
            updatedsubtask.setPriority_Id(subTask.getPriority_Id());
            updatedsubtask.setCompleted(subTask.isCompleted());
            subTaskRepository.save(updatedsubtask);
        }
    }
}
