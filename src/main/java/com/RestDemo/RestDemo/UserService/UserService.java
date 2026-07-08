package com.RestDemo.RestDemo.UserService;

import com.RestDemo.RestDemo.dto.UserDto;
import com.RestDemo.RestDemo.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class UserService
{
  private final UserRepository userRepository;

  public UserService(UserRepository userRepository)
  {
    this.userRepository = userRepository;
  }
  public List<UserDto> getAllUsers()
  {

      return userRepository.findAll();
  }
  public UserDto  getUserById(int id)
  {
    return userRepository.getUserById(id);
  }
}
