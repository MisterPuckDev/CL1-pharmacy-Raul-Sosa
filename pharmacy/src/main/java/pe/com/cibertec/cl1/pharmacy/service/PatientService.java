package pe.com.cibertec.cl1.pharmacy.service;

import java.util.List;

import pe.com.cibertec.cl1.pharmacy.model.Patient;

public interface PatientService {

	public List<Patient> listPatient();

	public Patient addPatient(Patient objPatient);

	public Patient updatePatient(Patient objPatient);

	public void deletePatient(int id);

}
