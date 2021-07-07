package com.assignment.ABC.Inc.service;

import com.assignment.ABC.Inc.model.Project;
import com.assignment.ABC.Inc.model.Task;
import com.assignment.ABC.Inc.repository.ProjectRepository;
import com.assignment.ABC.Inc.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TaskService {
    @Autowired
    private TaskRepository rep;




    public Task saveTask(Task task) {
        return rep.save(task);
    }

    public List<Task> saveTask(List<Task> task) {
        return rep.saveAll(task);
    }

    public List<Task> getTask() {
        return rep.findAll();
    }

    public Task getTaskById(UUID id) {
        return rep.findById(id).orElse(null);
    }

    public Task getTaskByName(String name) {
        return rep.findByName(name);
    }


    public String deleteTask(UUID id) {
        rep.deleteById(id);
        return "Task removed with ID: " + id;
    }

    public Task updateTask(Task task) {
        Task existingTask = rep.findById(task.getId()).orElse(null);
        existingTask.setTaskName(task.getTaskName());
        existingTask.setTaskStatus(task.getTaskStatus());
        return rep.save(existingTask);
    }
}
