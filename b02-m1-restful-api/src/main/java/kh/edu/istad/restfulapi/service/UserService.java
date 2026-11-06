package kh.edu.istad.restfulapi.service;

import kh.edu.istad.restfulapi.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

    List<User> getAll();

    User getById(UUID id);

}
