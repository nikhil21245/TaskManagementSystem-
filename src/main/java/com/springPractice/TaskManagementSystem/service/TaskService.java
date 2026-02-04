package com.springPractice.TaskManagementSystem.service;

import com.springPractice.TaskManagementSystem.entity.Task;
import com.springPractice.TaskManagementSystem.repo.TaskRepo;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepo taskRepo;

    public Task createTask(Task task) {
        task.setCompleted(false); // Set default completed status to false
       return  taskRepo.save(task);
    }

    public Task getTaskByid(Long id) {
        return taskRepo.findById(Math.toIntExact(id)).orElseThrow(() -> new RuntimeException("Task not found with id: " + id));
    }

    public Task MarkTask(Long id) {
        Task task = taskRepo.findById(Math.toIntExact(id)).orElseThrow(() -> new RuntimeException("Task not found with id: " + id));
        task.setCompleted(true);
        return taskRepo.save(task);
    }
}
