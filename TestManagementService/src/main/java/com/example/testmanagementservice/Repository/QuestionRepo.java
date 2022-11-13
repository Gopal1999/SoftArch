package com.example.testmanagementservice.Repository;


import com.example.testmanagementservice.Entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepo extends JpaRepository<Question, Integer>
{

}
