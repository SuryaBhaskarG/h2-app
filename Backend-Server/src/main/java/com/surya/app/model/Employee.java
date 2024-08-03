package com.surya.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Employee
{
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  private String firstName;
  private String lastName;
  private String email;
}










/*
 * INSERT INTO Employee (firstName, lastName, email) VALUES ('John', 'Doe', 'john.doe@example.com');
INSERT INTO Employee (firstName, lastName, email) VALUES ('Jane', 'Smith', 'jane.smith@example.com');
INSERT INTO Employee (firstName, lastName, email) VALUES ('Mike', 'Johnson', 'mike.johnson@example.com');
INSERT INTO Employee (firstName, lastName, email) VALUES ('Emily', 'Davis', 'emily.davis@example.com');
INSERT INTO Employee (firstName, lastName, email) VALUES ('Robert', 'Brown', 'robert.brown@example.com');
*/
