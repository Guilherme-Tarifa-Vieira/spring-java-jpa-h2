package com.example.projectv01.controllers;

import com.example.projectv01.entities.Department;
import com.example.projectv01.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping
    public List<Department> findAll() {
        List<Department> result = departmentRepository.findAll();
        return result;


    }

    @GetMapping(value = "/{id}")
    public Department findById(@PathVariable Long id) {
        Department result = departmentRepository.findById(id).get();
        return result;
    }

}
