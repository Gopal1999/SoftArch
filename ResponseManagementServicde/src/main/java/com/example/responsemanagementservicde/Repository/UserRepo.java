package com.example.responsemanagementservicde.Repository;

import com.example.responsemanagementservicde.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer>
{

}
