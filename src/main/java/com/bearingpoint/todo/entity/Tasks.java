package com.bearingpoint.todo.entity;

public class Tasks {

  private final int id;
  private final int user_id;
  private final String title;
  private final String description ;
  private final int category_id;
  private final int priority_id;
  private final String isCompleted;

    public Tasks(int id, int user_id, String title, String description, int category_id, int priority_id, String isCompleted) {
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

    public int getUser_id() {
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

    public String getIsCompleted() {
        return isCompleted;
    }
}
