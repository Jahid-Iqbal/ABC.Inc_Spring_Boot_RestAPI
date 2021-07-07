package com.assignment.ABC.Inc.controller;
import com.assignment.ABC.Inc.model.Project;
import com.assignment.ABC.Inc.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
public class ProjectController {

    @Autowired
    private ProjectService service;

    @PostMapping("/addProject")
    public Project addProject(@RequestBody Project project) {
        return service.saveProject(project);
    }

    @PostMapping("/addProjects")
    public List<Project> addProjects(@RequestBody List<Project> projects) {
        return service.saveProjects(projects);
    }

    @GetMapping("/Projects")
    public List<Project> findAllProjects() {
        return service.getProjects();
    }

    @GetMapping("/ProjectById/{id}")
    public Project findProjectById(@PathVariable UUID id) {
        return service.getProjectById(id);
    }

    @GetMapping("/Project/{name}")
    public Project findProjectByName(@PathVariable String name) {
        return service.getProjectByName(name);
    }

    @PutMapping("/update")
    public Project updateProject(@RequestBody Project project) {
        return service.updateProject(project);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProject(@PathVariable UUID id) {
        return service.deleteProject(id);
    }
}
