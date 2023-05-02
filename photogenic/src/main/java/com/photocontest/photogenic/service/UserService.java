package com.photocontest.photogenic.service;

import com.photocontest.photogenic.model.request.RegisterUserRequest;
import com.photocontest.photogenic.model.request.UpdateUserRequest;
import com.photocontest.photogenic.service.dto.UserDTO;

import java.util.List;

public interface UserService {

    List<UserDTO> getAllUsers();

    UserDTO getUserById(Integer userId);

    UserDTO addUser(RegisterUserRequest request);

    UserDTO updateUser(Integer userId, UpdateUserRequest request);

    void removeUserById(Integer userId);
}
