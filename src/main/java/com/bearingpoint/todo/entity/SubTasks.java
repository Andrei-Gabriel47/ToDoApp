package com.bearingpoint.todo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Entity
@Table(name="subtasks")
public class SubTasks {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int task_id;
    private String title;
    private String description;
    private int priority_id;

    private  boolean isCompleted;

    public SubTasks(int id, int task_id, String title, String description, int priority_id, boolean isCompleted) {
        this.id = id;
        this.task_id = task_id;
        this.title = title;
        this.description = description;
        this.priority_id = priority_id;
        this.isCompleted=isCompleted;
    }

    public int getId() {
        return id;
    }

    public int getTask_id() {
        return task_id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority_id() {
        return priority_id;
    }

    public boolean getIsCompleted() {
        return isCompleted;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPriority_id(int priority_id) {
        this.priority_id = priority_id;
    }

    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }
}
