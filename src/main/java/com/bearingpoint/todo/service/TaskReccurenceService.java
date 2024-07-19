package com.bearingpoint.todo.service;

import com.bearingpoint.todo.entity.TaskReccurence;
import com.bearingpoint.todo.entity.Tasks;
import com.bearingpoint.todo.repository.TaskReccurenceRepository;
import com.bearingpoint.todo.repository.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TaskReccurenceService {

    private final TaskReccurenceRepository taskReccurenceRepository;

    @Autowired
    public TaskReccurenceService(TaskReccurenceRepository taskReccurenceRepository) {
        this.taskReccurenceRepository = taskReccurenceRepository;
    }

    public void addTaskReccurence(TaskReccurence TaskReccurence) {
        taskReccurenceRepository.save(TaskReccurence);
    }

    public List<TaskReccurence> getAllTaskReccurence() {
        return (List<TaskReccurence>) taskReccurenceRepository.findAll();
    }

    public Optional<TaskReccurence> getTaskReccurenceById(int id) {
        return taskReccurenceRepository.findById(id);
    }

    public void deleteTask(int id) {
        taskReccurenceRepository.deleteById(id);
    }

    public void updateTask(int id, TaskReccurence newTaskReccurence) {
        Optional<TaskReccurence> optionalTaskReccurence = taskReccurenceRepository.findById(id);
        if (optionalTaskReccurence.isPresent()) {
            TaskReccurence existingTaskReccurence = optionalTaskReccurence.get();
            existingTaskReccurence.setDue_date(newTaskReccurence.getDue_date());
            existingTaskReccurence.setNext_due_date(newTaskReccurence.getNext_due_date());
            existingTaskReccurence.setRecurrence_type(newTaskReccurence.getRecurrence_type());
            taskReccurenceRepository.save(existingTaskReccurence);
        }
    }
}
