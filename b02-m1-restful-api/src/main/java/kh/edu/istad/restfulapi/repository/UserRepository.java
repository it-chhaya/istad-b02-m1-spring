package kh.edu.istad.restfulapi.repository;

import kh.edu.istad.restfulapi.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class UserRepository {

    private List<User> users;

    public UserRepository() {
        users = List.of(
                new User(UUID.randomUUID(), "admin", "qwer", "Administrator", true),
                new User(UUID.randomUUID(), "editor", "qwer", "Editor", true),
                new User(UUID.randomUUID(), "customer", "qwer", "Chan Dara", true)
        );
    }

    public List<User> selectAll() {
        return users;
    }

}
