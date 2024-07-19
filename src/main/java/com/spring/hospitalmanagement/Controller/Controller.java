package com.spring.hospitalmanagement.Controller;

import com.spring.hospitalmanagement.Model.Department;
import com.spring.hospitalmanagement.Model.Nurse;
import com.spring.hospitalmanagement.Repository.DepartmentRepository;
import com.spring.hospitalmanagement.Repository.NurseRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v2")
public class Controller {

    private final NurseRepository nurseRepository;
    private  final DepartmentRepository departmentRepository;

    public Controller(
            NurseRepository nurseRepository,
            DepartmentRepository departmentRepository
    ) {
        this.nurseRepository = nurseRepository;
        this.departmentRepository = departmentRepository;
    }

    @GetMapping("/nurses")
    @ResponseStatus(HttpStatus.OK)
    public List<Nurse> findAll(){
        return  nurseRepository.findAll();
    }

    @GetMapping("/departments")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Department> finAllDepartments(){
        return departmentRepository.findAll();
    }

    @GetMapping("/departments/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Optional<Department> findDepartmentById(@PathVariable Integer id){
        return  departmentRepository.findById(id);
    }

}
