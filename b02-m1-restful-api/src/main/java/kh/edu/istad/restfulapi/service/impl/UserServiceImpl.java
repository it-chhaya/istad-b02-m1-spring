package kh.edu.istad.restfulapi.service.impl;

import kh.edu.istad.restfulapi.dto.UserCreateRequest;
import kh.edu.istad.restfulapi.dto.UserResponse;
import kh.edu.istad.restfulapi.model.User;
import kh.edu.istad.restfulapi.repository.UserRepository;
import kh.edu.istad.restfulapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    public UserResponse create(UserCreateRequest userCreateRequest) {
        // 1. Map data from dto to domain model
        User user = new User();
        user.setUsername(userCreateRequest.username());
        user.setPassword(userCreateRequest.password());
        user.setFullName(userCreateRequest.fullName());

        // 2. Manage system data
        user.setId(UUID.randomUUID());
        user.setIsActive(true);

        // TODO: write your business logic here

        // 3. Save data
        userRepository.insertOne(user);

        // 4. Map data from domain model to dto
        return new UserResponse(
                user.getId(),
                user.getFullName(),
                user.getIsActive()
        );
    }


    @Override
    public List<UserResponse> getAll() {
        return userRepository.selectAll()
                .stream()
                .map(user -> new UserResponse(user.getId(),
                        user.getFullName(),
                        user.getIsActive()))
                .toList();
    }

    @Override
    public User getById(UUID id) {
        return null;
    }

}
