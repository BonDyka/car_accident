package ru.job4j.police.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.job4j.police.domain.User;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
