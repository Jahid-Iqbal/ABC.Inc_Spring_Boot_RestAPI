package com.assignment.ABC.Inc.repository;

import com.assignment.ABC.Inc.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TaskRepository extends JpaRepository<Task, UUID> {


    Task findByName(String name);
}
