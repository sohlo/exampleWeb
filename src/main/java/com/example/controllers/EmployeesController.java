package com.example.controllers;

import com.example.model.Boss;
import com.example.model.Employee;
import com.example.repository.BossRepository;
import com.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeesController {

    private EmployeeRepository employeeRepository;

    private BossRepository bossRepository;

    @Autowired
    public EmployeesController(EmployeeRepository employeeRepository, BossRepository bossRepository) {
        this.employeeRepository = employeeRepository;
        this.bossRepository = bossRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Boss> index() {
        setDemoData();
        return bossRepository.findAll();
    }

    private void setDemoData() {
        Employee employee1 = new Employee();
        employee1.setFirstName("Employ1");
        employee1.setLastName("Employ1surname");
        Employee employee2 = new Employee();
        employee2.setFirstName("Employ2");
        employee2.setLastName("Employ2surname");
        employeeRepository.save(employee1);
        employeeRepository.save(employee2);
        Boss boss = new Boss();
        boss.setFirstName("TEST1");
        boss.setLastName("132LAsT");
        boss.setEmployees(Arrays.asList(employee1, employee2));
        bossRepository.save(boss);

    }

}
