package com.vohizy.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentsRepo {
    @Autowired
    private StudentRepository repository;
    @GetMapping("/Students")
    public void Getmap(ClassJDBC ListOfAllStudent){
        ListOfAllStudent.findAll();
    }
}
