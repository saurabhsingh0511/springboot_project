package com.example.demo.Controller;

import com.example.demo.Entity.EmployeeEntity;
import com.example.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController
{
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/save")
    public EmployeeEntity saveData(@RequestBody EmployeeEntity employeeEntity)
    {
        return employeeService.saveData(employeeEntity);
    }

    @GetMapping("/{id}")
    public Optional<EmployeeEntity> findById(@PathVariable int id)
    {
        return employeeService.findById(id);
    }

    @GetMapping("/getAll")
    public List<EmployeeEntity> findAll()
    {
        return employeeService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id)
    {
        employeeService.deleteById(id);
    }
}
