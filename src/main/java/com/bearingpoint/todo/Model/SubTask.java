package com.bearingpoint.todo.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "SUBTASKS")
public class SubTask
{
    @org.springframework.data.annotation.Id
    @Column("ID")
    private int Id;
    @Column("TASK_ID")
    private int Task_Id;
    @Column("TITLE")
    private String Title;
    @Column("DESCRIPTION")
    private String Description;
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

    public int getTask_Id() {
        return Task_Id;
    }

    public void setTask_Id(int task_Id) {
        Task_Id = task_Id;
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
