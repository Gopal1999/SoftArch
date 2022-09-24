package com.example.saa2.Entity;

import javax.persistence.*;

@Entity
public class User
{
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private int user_id;

    @Column
    private String username;

    @Column
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String Fname;

    @Column(nullable = false)
    private String Lname;

    @Column
    private boolean loginstatus;

    @OneToOne(mappedBy = "user")
    private Test test;

    @OneToOne(mappedBy = "user")
    private TestResponse testResponse;

    public User(){

    }

    public User(int user_id, String username, String email, String password, String fname, String lname, boolean loginstatus) {
        this.user_id = user_id;
        this.username = username;
        this.email = email;
        this.password = password;
        Fname = fname;
        Lname = lname;
        this.loginstatus = loginstatus;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname.toUpperCase();
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname.toUpperCase();
    }

    public boolean isLoginstatus() {
        return loginstatus;
    }

    public void setLoginstatus(boolean loginstatus) {
        this.loginstatus = loginstatus;
    }
}
