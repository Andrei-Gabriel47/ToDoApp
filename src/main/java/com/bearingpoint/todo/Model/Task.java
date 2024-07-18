package com.bearingpoint.todo.Model;

public class Task
{
    private int Id;

    private int User_Id;

    public int getUser_Id() {
        return User_Id;
    }

    public void setUser_Id(int user_Id) {
        User_Id = user_Id;
    }


    private String Title;

    private String Description;

    private int Category_Id;

    private int Priority_Id;

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
