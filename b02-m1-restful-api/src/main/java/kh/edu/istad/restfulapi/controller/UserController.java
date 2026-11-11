package kh.edu.istad.restfulapi.controller;

import kh.edu.istad.restfulapi.dto.UserCreateRequest;
import kh.edu.istad.restfulapi.dto.UserResponse;
import kh.edu.istad.restfulapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;


    @PostMapping
    public void create(@RequestBody UserCreateRequest userCreateRequest) {
        IO.print("userCreateRequest: " + userCreateRequest);
    }


    @GetMapping
    public List<UserResponse> getAll() {
        return userService.getAll();
    }

}
