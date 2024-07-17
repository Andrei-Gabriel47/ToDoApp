package com.bearingpoint.todo.entity;

public class Categories {

    private final int id;
    private final String name;

    public Categories(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
