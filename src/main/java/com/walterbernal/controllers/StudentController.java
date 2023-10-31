package com.walterbernal.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.walterbernal.beans.Student;

@RestController
public class StudentController {
  
  public static List<Student> students = new ArrayList<Student>();

  public StudentController() {
    students.add(new Student("King", "Kochar"));
    students.add(new Student("Shreya", "Sharma"));
    students.add(new Student("Sarah", "Bowling"));
    students.add(new Student("John", "Smith"));
    students.add(new Student("Gautam", "Bhalla"));
  }

  @GetMapping("/students")
  public List<Student> getStudents() {
    return students;
  }

  @GetMapping("/student/{firstName}/{lastName}")
  public Student studentPathVariable(@PathVariable("firstName") String firstName,
      @PathVariable("lastName") String lastName) {
        return new Student(firstName, lastName);
  }

}