package com.example.usermanagementservice.Repository;

import com.example.usermanagementservice.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Integer>
{
    Optional<User> findByEmail(String email);

    Optional<User> findByUsername(String username);
}
