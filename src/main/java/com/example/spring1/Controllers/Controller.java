package com.example.spring1.Controllers;

import com.example.spring1.services.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private StudentServiceImpl studentService;

    @GetMapping("/")
    public String init(Model model) {
        var students = studentService.getStudents();
        model.addAttribute("students", students);
        return "index";
    }

}
