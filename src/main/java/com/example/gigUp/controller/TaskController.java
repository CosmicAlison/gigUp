package main.java.com.example.gigUp.controller;

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
        return taskService.getAlltasks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
        Optional<Task> task = taskService.getTaskById(id);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.saveTask(task);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task taskDetails) {
        Optional<Task> taskOptional = taskService.getTaskById(id);
        if (taskOptional.isPresent()) {
            Task task = taskDetails.get();
            task.setBidders(taskOptional.getBidders());
            task.setCategory(taskOptional.getCategory());
            task.setCompleter(taskOptional.getCompleter());
            task.setCompletionDate(taskOptional.getCompletionDate());
            task.setDescription(taskOptional.getDescription());
            task.setDuration(taskOptional.getDuration());
            return ResponseEntity.ok(userService.updateProduct(user));
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
