package com.bearingpoint.todo.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import java.util.Date;


@Entity
@Table(name="taskrecurrence")
public class TaskReccurence {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int task_id;
    private Date due_date;
    private String recurrence_type;
    private Date next_due_date;

    public TaskReccurence(int task_id, Date due_date, String recurrence_type, Date next_due_date) {
        this.task_id = task_id;
        this.due_date = due_date;
        this.recurrence_type = recurrence_type;
        this.next_due_date = next_due_date;
    }

    public int getTask_id() {
        return task_id;
    }

    public Date getDue_date() {
        return due_date;
    }

    public String getRecurrence_type() {
        return recurrence_type;
    }

    public Date getNext_due_date() {
        return next_due_date;
    }


    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }

    public void setRecurrence_type(String recurrence_type) {
        this.recurrence_type = recurrence_type;
    }

    public void setNext_due_date(Date next_due_date) {
        this.next_due_date = next_due_date;
    }
}
