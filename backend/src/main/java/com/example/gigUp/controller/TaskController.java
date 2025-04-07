package com.example.gigUp.controller;

import com.example.gigUp.model.Task;
import com.example.gigUp.service.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/task")
public class TaskController {
     @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> getAllUser() {
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
        Optional<Task> task = taskService.getTaskById(id);
        return task.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.saveTask(task);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task taskDetails) {
        Optional<Task> taskOptional = taskService.getTaskById(id);
        if (taskOptional.isPresent()) {
            Task task = taskOptional.get();
            task.setBidders(taskDetails.getBidders());
            task.setCategory(taskDetails.getCategory());
            task.setCompleter(taskDetails.getCompleter());
            task.setCompletionDate(taskDetails.getCompletionDate());
            task.setDescription(taskDetails.getDescription());
            task.setDuration(taskDetails.getDuration());
            task.setTitle(taskDetails.getTitle());
            task.setLocation(taskDetails.getLocation());
            task.setRegional(taskDetails.getRegional());
            task.setWorldwide(taskDetails.getWorldwide());
            task.setKeywords(taskDetails.getKeywords());
            return ResponseEntity.ok(taskService.updateTask(id, task));
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
