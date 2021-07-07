package com.assignment.ABC.Inc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Task_Table")
public class Task {

    @Id
    //defining primary key
    @GeneratedValue
    //auto generated
    private UUID id;
    private String TaskName;
    private String taskStatus;

}
