package com.springPractice.TaskManagementSystem.contrioller;

import com.springPractice.TaskManagementSystem.entity.Task;
import com.springPractice.TaskManagementSystem.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskControlller {

    private final TaskService taskService;
    // to post a task
    @PostMapping("/create" )
   public ResponseEntity<Task> createTask(@RequestBody Task task) {
        Task savedTask = taskService.createTask(task);
        return ResponseEntity.status(201).body(savedTask);
    }
    // get task by id
    @GetMapping("/getTask")
    public ResponseEntity<Task> getTaskById(@RequestParam Long id){
        Task task = taskService.getTaskByid(id);
        return ResponseEntity.status(200).body(task);
    }
    // update task by id
    @PutMapping("/markTask")
    public ResponseEntity<Task> MarkTask(Long id){
        Task task = taskService.MarkTask(id);
        return ResponseEntity.status(200).body(task);
    }
    @GetMapping("/")
    public String home() {
        return "Task Management System is running 🚀";
    }
}
