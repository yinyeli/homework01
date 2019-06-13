package com.bjtu.assignment4.demo.repository;

import com.bjtu.assignment4.demo.bean.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Repository
public interface EmployeeRepository extends ReactiveMongoRepository<Employee, Integer>{

    Mono<Employee> findByEmployeeName(String employeeName);
}
