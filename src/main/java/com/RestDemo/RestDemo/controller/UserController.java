package com.RestDemo.RestDemo.controller;

import com.RestDemo.RestDemo.UserService.UserService;
import com.RestDemo.RestDemo.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController
{
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
   public List<UserDto> getAllUsers()
    {
       return userService.getAllUsers();
    }
    @GetMapping("/{Id}")
    public UserDto getUserById(@PathVariable int Id)
        {
        return userService.getUserById(Id);
        }
}
