package com.bearingpoint.todo.Model;
import jakarta.persistence.*;

@Entity
@Table(name = "Users")

public class User
{

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private  int Id;

    @Column(name = "Username")
    private String Username;

    @Column(name = "Email")
    private String Email;

    @Column(name = "Password")
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
