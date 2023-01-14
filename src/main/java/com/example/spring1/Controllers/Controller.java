package com.example.spring1.Controllers;

import com.example.spring1.dao.StudentDao;
import com.example.spring1.services.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private StudentServiceImpl studentService;
    @Autowired
    private StudentDao studentDao;

    @GetMapping("/")
    public String init(Model model) {
        var students = studentService.getStudents();
        model.addAttribute("students", students);
        return "index";
    }

    @GetMapping("/addstudent")
    public String addStudent(Student student) {
        return "patch_student";
    }

    @PostMapping("/save_changes")
    public String saveChangeStudent(Student student) {
        studentService.save(student);
        return "redirect:/";
    }

    @PostMapping("/cancel_changes")
    public String cancelChange() {
        return "index";
    }

    @GetMapping("/setstudent/{id}")
    public String setStudent(Student student, Model model) {
        var student1 = studentService.findStudent(student);
        model.addAttribute("student", student1);
        return "patch_student";
    }


}
