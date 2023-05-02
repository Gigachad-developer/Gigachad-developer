package com.Crud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Crud.Model.Patient;
import com.Crud.Service.PserviceImpl;

@RestController
public class Pcontroller {

	@Autowired
	private PserviceImpl service;
	
	@GetMapping("/patient/{id}")
	private Patient getPatientById(@PathVariable("id")int id)
	{
		return service.getPatientById(id);
		
	}
	@GetMapping("/patient")
	private List<Patient> getAllPatient()
	{
		return service.getAllPatient();
	}
	@DeleteMapping("/patient/{id}")
	private void deletePatient(@PathVariable("id") int id)
	{
		service.deletePatient(id);
		System.out.print("the user has been deleted");
	}
	@PostMapping("/patient")
	private int savePatient(@RequestBody Patient patient)
	{
		service.savePatient(patient);
		return patient.getId();
	}
	@PutMapping("/patient")
	private Patient updatePatient(@RequestBody Patient patient )
	{
		service.updatePatient(patient);
		return patient;
	}
	
	
}
