package com.photocontest.photogenic.service.impl;

import com.photocontest.photogenic.model.request.RegisterUserRequest;
import com.photocontest.photogenic.model.request.UpdateUserRequest;
import com.photocontest.photogenic.service.UserService;
import com.photocontest.photogenic.service.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<UserDTO> getAllUsers() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public UserDTO getUserById(Integer userId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public UserDTO addUser(RegisterUserRequest request) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public UserDTO updateUser(Integer userId, UpdateUserRequest request) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void removeUserById(Integer userId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
