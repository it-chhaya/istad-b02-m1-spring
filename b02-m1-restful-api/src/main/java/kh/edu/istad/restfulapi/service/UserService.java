package kh.edu.istad.restfulapi.service;

import kh.edu.istad.restfulapi.dto.UserResponse;
import kh.edu.istad.restfulapi.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

    List<UserResponse> getAll();

    User getById(UUID id);

}
