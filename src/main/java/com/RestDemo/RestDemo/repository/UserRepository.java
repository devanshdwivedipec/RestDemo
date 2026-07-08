package com.RestDemo.RestDemo.repository;

import com.RestDemo.RestDemo.dto.UserDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository
{
    private final List<UserDto> user = new ArrayList<UserDto>();

    public UserRepository()
    {
        user.add(new UserDto(1L,"Dev","dev@in"));
        user.add(new UserDto(2L,"De","de@in"));
        user.add(new UserDto(3L,"D","d@in"));
    }
public List<UserDto> findAll()
{
    return this.user;
}
public UserDto getUserById(int id)
{
    return this.user.get(id);
}
}
