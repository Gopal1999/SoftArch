package com.example.usermanagementservice.Controller;

import com.example.usermanagementservice.Entity.User;
import com.example.usermanagementservice.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController
{
    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String check()
    {
        return "Hello";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/get/{userid}")
    public User getUser(@PathVariable Integer userid)
    {
        return userService.findUser(userid);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/register")
    public String register(@RequestBody User user)
    {
        System.out.println(user);
        userService.registerUser(user);
        return "User Registered";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/login")
    public String authenticateUser(@RequestBody User user)
    {
        int status;
        if(user.getUsername().isEmpty())
        {
            status = userService.loginbyEmail(user);
        }
        else
        {
            status = userService.loginByUsername(user);
        }
        if(status==0)
        {
            return "Invalid Credentials";
        }
        if(status==2)
        {
            return "Already Logged In";
        }
        return "Login Successful";
    }

}
