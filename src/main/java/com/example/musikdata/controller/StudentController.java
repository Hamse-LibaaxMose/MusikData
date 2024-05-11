package com.example.musikdata.controller;

import com.example.musikdata.model.Student;
import com.example.musikdata.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/student")
    public String getAllStudent(Model model){
        List<Student> studentAll = studentRepository.getAll();
        model.addAttribute("studentAllO",studentAll);
        return "student";
    }
}
