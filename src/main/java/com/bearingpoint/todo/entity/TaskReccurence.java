package com.bearingpoint.todo.entity;

public class TaskReccurence {

    private final int task_id;
    private final String due_date;
    private final String recurrence_type;
    private final String next_due_date;

    public TaskReccurence(int task_id, String due_date, String recurrence_type, String next_due_date) {
        this.task_id = task_id;
        this.due_date = due_date;
        this.recurrence_type = recurrence_type;
        this.next_due_date = next_due_date;
    }

    public int getTask_id() {
        return task_id;
    }

    public String getDue_date() {
        return due_date;
    }

    public String getRecurrence_type() {
        return recurrence_type;
    }

    public String getNext_due_date() {
        return next_due_date;
    }



}
