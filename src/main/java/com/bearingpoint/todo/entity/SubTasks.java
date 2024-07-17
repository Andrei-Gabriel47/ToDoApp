package com.bearingpoint.todo.entity;

public class SubTasks {

    private final int id;
    private final int task_id;
    private final String title;
    private final String description;
    private final int priority_id;

    private final String isCompleted;

    public SubTasks(int id, int task_id, String title, String description, int priority_id, String isCompleted) {
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

    public String getIsCompleted() {
        return isCompleted;
    }
}
