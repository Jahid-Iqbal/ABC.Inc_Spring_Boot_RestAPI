package com.assignment.ABC.Inc.repository;

import com.assignment.ABC.Inc.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProjectRepository extends JpaRepository<Project, UUID>
//JpaRepository<Project,Integer> :: <model name,type of primary key>
{

    Project findByName(String name);
}
