package com.example.testmanagementservice.Repository;


import com.example.testmanagementservice.Entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepo extends JpaRepository<Test, Integer>
{

}
