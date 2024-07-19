package com.bearingpoint.todo.entity;

import jakarta.persistence.*;

import org.springframework.data.annotation.Id;

@Entity
@Table(name="tasks")
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int user_id;
    private String title;
    private String description ;
    private int category_id;
    private int priority_id;
    private boolean isCompleted;

    public Tasks() {}

    public Tasks(int id, int user_id, String title, String description, int category_id, int priority_id, boolean isCompleted) {
        this.id = id;
        this.user_id = user_id;
        this.title = title;
        this.description = description;
        this.category_id = category_id;
        this.priority_id = priority_id;
        this.isCompleted=isCompleted;
    }

    public int getId() {
        return id;
    }

    public int getUser() {
        return user_id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getCategory_id() {
        return category_id;
    }

    public int getPriority_id() {
        return priority_id;
    }

    public Boolean getIsCompleted() {
        return isCompleted;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUser(int user_id) {
        this.user_id = user_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public void setPriority_id(int priority_id) {
        this.priority_id = priority_id;
    }

    public void setIsCompleted(Boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

}