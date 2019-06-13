package com.bjtu.assignment4.demo.controller;

import com.bjtu.assignment4.demo.bean.Employee;
import com.bjtu.assignment4.demo.handler.EmployeeHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
@RequestMapping(value = "/emps")
public class EmployeeWebFluxController {

    @Autowired
    private EmployeeHandler employeeHandler;

    @GetMapping(value = "/{id}")
    @ResponseBody
    public Mono<Employee> findEmployeeById(@PathVariable("id") Integer id){
        return employeeHandler.findEmployeeById(id);
    }

    @GetMapping()
    @ResponseBody
    public Flux<Employee> findAllEmployee(){
        return employeeHandler.findAllEmployee();
    }

    @PostMapping()
    @ResponseBody
    public Mono<Employee> insertEmployee(@RequestBody Employee emp){
        return employeeHandler.insertEmployee(emp);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseBody
    public Mono<Integer> deleteEmployee(@PathVariable("id") Integer id){
        return employeeHandler.deleteEmployee(id);
    }

}
