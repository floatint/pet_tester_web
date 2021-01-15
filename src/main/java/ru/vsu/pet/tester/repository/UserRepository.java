package ru.vsu.pet.tester.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vsu.pet.tester.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);
}
