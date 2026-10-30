package kh.edu.istad.springapp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class Category {
    private UUID id;
    private String name;
}
