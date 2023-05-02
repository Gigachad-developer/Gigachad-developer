package com.Crud.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Crud.Model.Patient;
import com.Crud.Repository.Prepository;

@Service
public class PserviceImpl implements Pservice {

	@Autowired 
	public Prepository repo;

	@Override
	public List<Patient> getAllPatient() {
		// TODO Auto-generated method stub
		List<Patient> patient =new ArrayList<Patient>();
		repo.findAll().forEach(patient1 ->patient.add(patient1));
		return patient;
	}
	
	@Override
	public Patient getPatientById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	
	@Override
	public void deletePatient(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public void updatePatient(Patient patient) {
		// TODO Auto-generated method stub
		repo.save(patient);
	}

	@Override
	public void savePatient(Patient patient) {
		// TODO Auto-generated method stub
		repo.save(patient);
	}
}
