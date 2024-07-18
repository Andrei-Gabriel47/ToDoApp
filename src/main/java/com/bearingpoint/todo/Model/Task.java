package com.bearingpoint.todo.Model;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(name="TASKS")
public class Task
{

    @org.springframework.data.annotation.Id
    @Column("ID")
    private int Id;
    @Column("USER_ID")
    private int User_Id;

    public int getUser_Id() {
        return User_Id;
    }

    public void setUser_Id(int user_Id) {
        User_Id = user_Id;
    }

    @Column("TITLE")
    private String Title;
    @Column("DESCRIPTION")
    private String Description;
    @Column("CATEGORY_ID")
    private int Category_Id;
    @Column("PRIORITY_ID")
    private int Priority_Id;
    @Column("ISCOMPLETED")
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
