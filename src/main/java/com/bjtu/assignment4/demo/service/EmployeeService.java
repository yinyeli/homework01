package com.bjtu.assignment4.demo.service;

import com.bjtu.assignment4.demo.bean.Employee;
import reactor.core.publisher.Flux;

public interface EmployeeService {
    Flux<Employee> findAll();
}
