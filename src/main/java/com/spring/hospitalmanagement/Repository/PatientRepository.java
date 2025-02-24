package com.spring.hospitalmanagement.Repository;

import com.spring.hospitalmanagement.Model.Patient;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends ListCrudRepository<Patient, Integer> {
}
