package com.bearingpoint.todo.service;

import com.bearingpoint.todo.entity.SubTasks;
import com.bearingpoint.todo.entity.Tasks;
import com.bearingpoint.todo.repository.SubTasksRepository;
import com.bearingpoint.todo.repository.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubTasksService {
    private final SubTasksRepository subTasksRepository;

    public SubTasksService(SubTasksRepository subTasksRepository) {
        this.subTasksRepository = subTasksRepository;
    }

    public void addSubTask(SubTasks subtask) {
        subTasksRepository.save(subtask);
    }

    public List<SubTasks> getAllSubTasks() {
        return (List<SubTasks>) subTasksRepository.findAll();
    }

    public Optional<SubTasks> getSubTaskById(int id) {
        return subTasksRepository.findById(id);
    }

    public void deleteSubTask(int id) {
        subTasksRepository.deleteById(id);
    }



    public void updateTask(int id, SubTasks newSubTask) {
        Optional<SubTasks> optionalSubTasks = subTasksRepository.findById(id);
        if (optionalSubTasks.isPresent()) {
            SubTasks existingSubTask = optionalSubTasks.get();
            existingSubTask.setTitle(newSubTask.getTitle());
            existingSubTask.setTask_id(newSubTask.getTask_id());
            existingSubTask.setDescription(newSubTask.getDescription());
            existingSubTask.setPriority_id(newSubTask.getPriority_id());
            subTasksRepository.save(existingSubTask);
        }
    }
}
