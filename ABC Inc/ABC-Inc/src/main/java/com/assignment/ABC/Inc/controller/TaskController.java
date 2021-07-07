package com.assignment.ABC.Inc.controller;

import com.assignment.ABC.Inc.model.Project;
import com.assignment.ABC.Inc.model.Task;
import com.assignment.ABC.Inc.service.ProjectService;
import com.assignment.ABC.Inc.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class TaskController {

    @Autowired
    private TaskService service;

    @PostMapping("/addTask")
    public Task addTask(@RequestBody Task task) {
        return service.saveTask(task);
    }

    @PostMapping("/addTasks")
    public List<Task> addTasks(@RequestBody List<Task> task) {
        return service.saveTask(task);
    }

    @GetMapping("/Tasks")
    public List<Task> findAllTask() {
        return service.getTask();
    }

    @GetMapping("/TaskById/{id}")
    public Task findTaskById(@PathVariable UUID id) {
        return service.getTaskById(id);
    }

    @GetMapping("/Task/{name}")
    public Task findTaskByName(@PathVariable String name) {
        return service.getTaskByName(name);
    }

    @PutMapping("/update")
    public Task updateTask(@RequestBody Task task) {
        return service.updateTask(task);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTask(@PathVariable UUID id) {
        return service.deleteTask(id);
    }
}
