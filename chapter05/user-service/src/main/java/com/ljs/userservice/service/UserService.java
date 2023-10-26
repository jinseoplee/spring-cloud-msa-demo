package com.ljs.userservice.service;

import com.ljs.userservice.dto.UserDto;
import com.ljs.userservice.entity.UserEntity;

public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getUserByUserId(String userId);

    Iterable<UserEntity> getUserByAll();
}
