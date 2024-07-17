package com.bearingpoint.todo.entity;

public class PriorityLevel {

    private final int id;
    private final String level;

    public PriorityLevel(int id, String level) {
        this.id = id;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public String getLevel() {
        return level;
    }
}
