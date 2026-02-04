package com.springPractice.TaskManagementSystem.repo;

import com.springPractice.TaskManagementSystem.entity.Task;
import org.springframework.data.domain.Limit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepo extends JpaRepository<Task, Integer> {
    List<Task> findByCompletedFalse(boolean completed, Limit limit);
}
