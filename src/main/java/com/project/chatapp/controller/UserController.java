package com.project.chatapp.controller;

import com.project.chatapp.common.AppConstant;
import com.project.chatapp.common.base.ApiResponse;
import com.project.chatapp.model.Users;
import com.project.chatapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(AppConstant.ApiPrefix.USER_PATH)
public class UserController {

    @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/list")
    public ResponseEntity<ApiResponse<?>> getAllUsers() {
        ApiResponse<Users> response = ApiResponse.success((Users) userService.findAll());
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<?>> getUserById(@PathVariable Long id) {
        ApiResponse<Users> response = ApiResponse.success(userService.findById(id));
        return ResponseEntity.ok(response);
    }

    @PostMapping("/")
    public ResponseEntity<ApiResponse<?>> createUser(@RequestBody Users user) {
        ApiResponse<Users> response = ApiResponse.created(userService.add(user));
        return ResponseEntity.ok(response);
    }

    @PutMapping("/")
    public ResponseEntity<ApiResponse<?>> updateUser(@RequestBody Users user) {
        ApiResponse<Users> response = ApiResponse.success(userService.update(user));
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<?>> deleteUser(@PathVariable Long id) {
        userService.deleteById(id);
        return ResponseEntity.noContent().build();

    }

}
