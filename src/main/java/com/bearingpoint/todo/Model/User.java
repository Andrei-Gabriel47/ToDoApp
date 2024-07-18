package com.bearingpoint.todo.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "USERS")
public class User
{


    @org.springframework.data.annotation.Id
    @Column("ID")
    private  int Id;
    private String Username;
    private String Email;
    private String Password;

    public User() {
    }

    public int getId() {
        return Id;
    }

    public String getUsername() {
        return Username;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }
    public void setId(int id) {
        this.Id = id;
    }

    public void setUsername(String username) {
        this.Username = username;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

}
