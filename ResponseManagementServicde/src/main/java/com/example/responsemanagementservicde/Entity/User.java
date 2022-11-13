package com.example.responsemanagementservicde.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

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


    @Column
    private String password;

    @Column
    private String Fname;

    @Column
    private String Lname;



//    @OneToOne(mappedBy = "user")
//    private Test test;

    @OneToOne(mappedBy = "user")
    @JsonIgnore
    private TestResponse testResponse;

    public User(){

    }

    public User(int user_id, String username, String email, String password, String fname, String lname, TestResponse testResponse) {
        this.user_id = user_id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.Fname = fname;
        this.Lname = lname;
        this.testResponse = testResponse;
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
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }
//
//    public boolean getLoginstatus() {
//        return loginstatus;
//    }
//
//    public void setLoginstatus(boolean loginstatus) {
//        this.loginstatus = loginstatus;
//    }
//
    public TestResponse getTestResponse() {
        return testResponse;
    }

    public void setTestResponse(TestResponse testResponse) {
        this.testResponse = testResponse;
    }

//    @Override
//    public String toString() {
//        return "User{" +
//                "user_id=" + user_id +
//                ", username='" + username + '\'' +
//                ", email='" + email + '\'' +
//                ", password='" + password + '\'' +
//                ", Fname='" + Fname + '\'' +
//                ", Lname='" + Lname + '\'' +
////                ", loginstatus=" + loginstatus +
//                ", testResponse=" + testResponse +
//                '}';
//    }
}
