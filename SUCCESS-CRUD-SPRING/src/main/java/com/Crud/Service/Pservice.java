package com.Crud.Service;

import java.util.List;

import com.Crud.Model.Patient;

public interface Pservice {

	public Patient getPatientById(int id);
	List<Patient> getAllPatient();
	public void savePatient(Patient patient);
	public void deletePatient(int id);
	public void updatePatient(Patient patient);
	
}
