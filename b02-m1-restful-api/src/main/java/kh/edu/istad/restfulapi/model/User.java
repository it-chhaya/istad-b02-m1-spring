package kh.edu.istad.restfulapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private UUID id;
    private String username;
    private String password;
    private String fullName;
    private Boolean isActive;
}
