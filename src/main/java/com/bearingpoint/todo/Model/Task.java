package com.bearingpoint.todo.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Tasks")
public class Task
{
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @ManyToOne
    @JoinColumn(name = "User_Id")
    private User user;
    @Column(name="Title")
    private String Title;
    @Column(name = "Description")
    private String Description;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Column(name="Category_Id")
    private int Category_Id;
    @Column(name = "Priority_Id")
    private int Priority_Id;
    @Column(name = "isCompleted")
    private boolean isCompleted;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }



    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getCategory_Id() {
        return Category_Id;
    }

    public void setCategory_Id(int category_Id) {
        Category_Id = category_Id;
    }

    public int getPriority_Id() {
        return Priority_Id;
    }

    public void setPriority_Id(int priority_Id) {
        Priority_Id = priority_Id;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
