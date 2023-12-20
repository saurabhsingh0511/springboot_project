package com.example.demo.Service;

import com.example.demo.Entity.EmployeeEntity;
import com.example.demo.Repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public EmployeeEntity saveData(EmployeeEntity employeeEntity)
    {
        return employeeRepo.save(employeeEntity);
    }

    public Optional<EmployeeEntity> findById(int id)
    {
        return employeeRepo.findById(id);
    }

    public List<EmployeeEntity> findAll()
    {
        return employeeRepo.findAll();
    }

    public void deleteById(int id)
    {
        employeeRepo.deleteById(id);
    }

}
