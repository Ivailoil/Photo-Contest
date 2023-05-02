package com.photocontest.photogenic.controller.rest;

import com.photocontest.photogenic.model.request.RegisterUserRequest;
import com.photocontest.photogenic.model.request.UpdateUserRequest;
import com.photocontest.photogenic.service.UserService;
import com.photocontest.photogenic.service.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    public static final String USER_DELETED = "User was deleted";

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        List<UserDTO> userDTOList = userService.getAllUsers();
        return new ResponseEntity<>(userDTOList, HttpStatus.OK);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserDTO> getUser(@PathVariable Integer userId) {
        UserDTO userDTO = userService.getUserById(userId);
        return new ResponseEntity<>(userDTO, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<UserDTO> registerUser(@RequestBody RegisterUserRequest request) {
        UserDTO newUser = userService.addUser(request);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @PutMapping("/{userId}")
    public ResponseEntity<UserDTO> updateUser(@PathVariable Integer userId,
                                              @RequestBody UpdateUserRequest request) {
        UserDTO updateUser = userService.updateUser(userId, request);
        return new ResponseEntity<>(updateUser, HttpStatus.OK);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable Integer userId) {
        userService.removeUserById(userId);
        return new ResponseEntity<>(USER_DELETED, HttpStatus.OK);
    }
}
