package com.satvik.QuizApplication.DAO;

import com.satvik.QuizApplication.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao  extends JpaRepository <Quiz, Integer>{
}
