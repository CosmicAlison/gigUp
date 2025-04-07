package com.example.gigUp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.gigUp.repository.TaskRepository;
import com.example.gigUp.model.Task;


@Service
public class TaskServiceImpl implements TaskService {
    
    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    @Override
    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task updateTask(Long id, Task taskDetails) {
        return taskRepository.findById(id).map(task -> {
            task.setTitle(taskDetails.getTitle());    
            task.setDescription(taskDetails.getDescription());
            task.setDuration(taskDetails.getDuration());
            return taskRepository.save(task);
        }).orElseThrow(() -> new RuntimeException("Task not found with ID: " + id));
    }

    @Override
    public void deleteTaskById(Long id) {
        taskRepository.deleteById(id);
    }
}
