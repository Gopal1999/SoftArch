package com.example.saa2.Repository;

import com.example.saa2.Entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepo extends JpaRepository<Test, Integer>
{

}
