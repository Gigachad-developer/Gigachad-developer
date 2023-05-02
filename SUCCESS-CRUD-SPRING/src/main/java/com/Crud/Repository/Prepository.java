package com.Crud.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Crud.Model.Patient;

@Repository
public interface Prepository extends CrudRepository<Patient, Integer>{

}
