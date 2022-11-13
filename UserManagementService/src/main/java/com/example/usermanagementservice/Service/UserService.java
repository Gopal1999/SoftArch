package com.example.usermanagementservice.Service;

import com.example.usermanagementservice.Entity.User;
import com.example.usermanagementservice.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService
{
    @Autowired
    UserRepo userRepo;
    public void registerUser(User user)
    {
        userRepo.save(user);
    }
    public int loginbyEmail(User user)
    {
        Optional<User> us = userRepo.findByEmail(user.getEmail());
        if(us.isEmpty())
        {
            return 0;
        }
        User obj = us.get();
        if(user.getEmail().equals(obj.getEmail()) && user.getPassword().equals(obj.getPassword()))
        {
            return 1;
        }
        return 0;
    }

    public int loginByUsername(User user)
    {
        Optional<User> us = userRepo.findByUsername(user.getUsername());
        if(us.isEmpty())
        {
            System.out.println("hello");
            return 0;
        }
        User obj = us.get();
        if(user.getUsername().equals(obj.getUsername()) && user.getPassword().equals(obj.getPassword()))
        {
            return 1;
        }
        return 0;
    }

    public User findUser(int userid)
    {
//        List<User> userList = userRepo.findAll();
//        for(User user:userList)
//        {
//            System.out.println(user);
//        }

        User user =  userRepo.findById(userid).get();
        System.out.println(user);
        return user;
    }
}
