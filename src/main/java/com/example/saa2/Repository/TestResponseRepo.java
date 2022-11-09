package com.example.saa2.Repository;

import com.example.saa2.Entity.Test;
import com.example.saa2.Entity.TestResponse;
import com.example.saa2.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestResponseRepo extends JpaRepository<TestResponse, Integer>
{
    TestResponse findByTestAndUser(Test test, User user);

    List<TestResponse> findByTest(Test test);
}
