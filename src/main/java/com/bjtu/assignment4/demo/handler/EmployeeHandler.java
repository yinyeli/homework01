package com.bjtu.assignment4.demo.handler;

import com.bjtu.assignment4.demo.bean.Employee;
import com.bjtu.assignment4.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class EmployeeHandler {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeHandler(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public Mono<Employee> findEmployeeById(Integer id){
        return employeeRepository.findById(id);
    }

    public Flux<Employee> findAllEmployee(){
        return employeeRepository.findAll();
    }

    public Mono<Employee> insertEmployee(Employee emp){
        return employeeRepository.save(emp);
    }

    public Mono<Employee> getEmployeeByName(String name){
        return employeeRepository.findByEmployeeName(name);
    }

    public Mono<Integer> deleteEmployee(Integer id){
        employeeRepository.deleteById(id);
        return Mono.create(employeeMonoSink -> employeeMonoSink.success(id));
    }
}
