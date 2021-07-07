package com.assignment.ABC.Inc.service;
import com.assignment.ABC.Inc.model.Project;
import com.assignment.ABC.Inc.repository.ProjectRepository;
import com.assignment.ABC.Inc.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProjectService {

    
        @Autowired
        private ProjectRepository rep;
        
        
        

        public Project saveProject(Project project) {
            return rep.save(project);
        }

        public List<Project> saveProjects(List<Project> projects) {
            return rep.saveAll(projects);
        }

        public List<Project> getProjects() {
            return rep.findAll();
        }

        public Project getProjectById(UUID id) {
            return rep.findById(id).orElse(null);
        }

        public Project getProjectByName(String name) {
            return rep.findByName(name);
        }


        public String deleteProject(UUID id) {
            rep.deleteById(id);
            return "Project removed with ID: " + id;
        }

        public Project updateProject(Project project) {
            Project existingProject = rep.findById(project.getId()).orElse(null);
            existingProject.setProjectName(project.getProjectName());
            existingProject.setStatus(project.getStatus());
            return rep.save(existingProject);
        }
    
}
