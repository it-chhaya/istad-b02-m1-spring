package kh.edu.istad.restfulapi.service.impl;

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
