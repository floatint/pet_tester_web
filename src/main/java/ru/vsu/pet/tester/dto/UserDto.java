package ru.vsu.pet.tester.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.vsu.pet.tester.entity.Role;

import java.util.Set;

@Data
@NoArgsConstructor
public class UserDto {
    private Long id;
    private String name;
    private String password;
    private Set<Role> roles;
}
