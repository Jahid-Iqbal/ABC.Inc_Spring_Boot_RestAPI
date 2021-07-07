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
@Table(name="Project_Table")
//DB table
public class Project {

    @Id
    //defining primary key
    @GeneratedValue
    //auto generated
    private UUID id;
    private String projectName;
    private String status;

}
