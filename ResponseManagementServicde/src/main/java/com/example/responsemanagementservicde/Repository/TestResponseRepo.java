package com.example.responsemanagementservicde.Repository;

import com.example.responsemanagementservicde.Entity.Test;
import com.example.responsemanagementservicde.Entity.TestResponse;
import com.example.responsemanagementservicde.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestResponseRepo extends JpaRepository<TestResponse, Integer>
{
    TestResponse findByTestAndUser(Test test, User user);

    List<TestResponse> findByTest(Test test);
}
