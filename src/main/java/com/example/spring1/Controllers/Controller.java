package com.example.spring1.Controllers;

import com.example.spring1.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;


@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private StudentDao studentDao;

    @GetMapping("/")
    public String init(Model model) {
        var students = studentDao.findAll();
        model.addAttribute("students", students);
        return "index";
    }

}
