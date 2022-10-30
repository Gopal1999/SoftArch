package com.example.saa2.Repository;

import com.example.saa2.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Integer>
{
    Optional<User> findByEmail(String email);

    Optional<User> findByUsername(String username);
}
