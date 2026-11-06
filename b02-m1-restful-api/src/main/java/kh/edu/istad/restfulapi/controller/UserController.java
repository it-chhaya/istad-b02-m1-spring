package kh.edu.istad.restfulapi.controller;

import kh.edu.istad.restfulapi.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @GetMapping
    public List<User> getAll() {
        return List.of(
                new User(UUID.randomUUID(), "admin", "qwer", "Administrator", true),
                new User(UUID.randomUUID(), "editor", "qwer", "Editor", true),
                new User(UUID.randomUUID(), "customer", "qwer", "Chan Dara", true)
        );
    }

}
