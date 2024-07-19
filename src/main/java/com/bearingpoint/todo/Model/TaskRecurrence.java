package com.bearingpoint.todo.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@Table(name = "TASKRECURRENCE")
public class TaskRecurrence {
    @Id
    private int Id;
    @Column("TASK_ID")
    private int Task_Id;
    @Column("DUE_DATE")
    private LocalDate Due_date;
    @Column("RECURRENCE_TYPE")
    private String Recurrence_Type;

    public int getTask_Id() {
        return Task_Id;
    }

    public void setTask_Id(int task_Id) {
        Task_Id = task_Id;
    }

    public LocalDate getDue_date() {
        return Due_date;
    }

    public void setDue_date(LocalDate due_date) {
        Due_date = due_date;
    }

    public String getRecurrence_Type() {
        return Recurrence_Type;
    }

    public void setRecurrence_Type(String recurrence_Type) {
        Recurrence_Type = recurrence_Type;
    }

    public LocalDate getNext_Due_Date() {
        return Next_Due_Date;
    }

    public void setNext_Due_Date(LocalDate next_Due_Date) {
        Next_Due_Date = next_Due_Date;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @Column("NEXT_DUE_DATE")
    private LocalDate Next_Due_Date;

}
