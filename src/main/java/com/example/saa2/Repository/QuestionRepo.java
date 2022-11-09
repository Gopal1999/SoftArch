package com.example.saa2.Repository;

import com.example.saa2.Entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepo extends JpaRepository<Question, Integer>
{

}
