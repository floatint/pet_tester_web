package ru.vsu.pet.tester.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vsu.pet.tester.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
