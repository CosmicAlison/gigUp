package com.example.gigUp.service;

import java.util.List;
import java.util.Optional;
import com.example.gigUp.model.Task;

public interface TaskService {
    List<Task> getAllTasks();
    Optional<Task>getTaskById(Long id);
    Task saveTask(Task task);
    Task updateTask(Task task);
    void deleteTask(Task task);
}
