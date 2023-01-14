package com.example.spring1.dao;

import com.example.spring1.Controllers.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<Student, Long> {

}
