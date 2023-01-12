package com.example.spring1.services;

import com.example.spring1.Controllers.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getStudents();

    public void save(Student student);

    public void delete(Student student);

    public Student findStudent(Student student);


}
