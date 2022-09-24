package com.example.saa2.Service;

import com.example.saa2.Entity.User;
import com.example.saa2.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService
{
    @Autowired
    private UserRepo userRepo;

    public int loginbyEmail(User user)
    {
        Optional<User> us = userRepo.findByEmail(user.getEmail());
        if(us.isEmpty())
        {
            return 0;
        }
        User obj = us.get();
        if(user.getEmail().equals(obj.getEmail()) && user.getPassword().equals(obj.getPassword()) && user.getFname().toUpperCase().equals(obj.getFname()) && user.getLname().toUpperCase().equals(obj.getLname()))
        {
            if(obj.isLoginstatus())
            {
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public int loginByUsername(User user)
    {
        Optional<User> us = userRepo.findByUsername(user.getEmail());
        if(us.isEmpty())
        {
            return 0;
        }
        User obj = us.get();
        if(user.getUsername().equals(obj.getUsername()) && user.getPassword().equals(obj.getPassword()) && user.getFname().toUpperCase().equals(obj.getFname()) && user.getLname().toUpperCase().equals(obj.getLname()))
        {
            if(obj.isLoginstatus())
            {
                return 2;
            }
            return 1;
        }
        return 0;
    }
}
