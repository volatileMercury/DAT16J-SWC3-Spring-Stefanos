package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by coag on 24-10-2017.
 */
public class User {
    private final long id;
    private String name;
    private String email;

    private static List<User> userList = new ArrayList<>();

    public User(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    static User findUserById(Long id){
        Iterator<User> iterator = getUserList().iterator();
        while(iterator.hasNext()){
            User temp = iterator.next();
            if(temp.getId()==id){
                return temp;
            }
        }
        return null;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static List<User> getUserList() {
        return userList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
