package pe.com.cibertec.cl1.pharmacy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.cibertec.cl1.pharmacy.model.Patient;
import pe.com.cibertec.cl1.pharmacy.repositories.PatientRepository;
import pe.com.cibertec.cl1.pharmacy.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	PatientRepository patientRepository;

	@Override
	public List<Patient> listPatient() {
		return patientRepository.findAll();
	}

	@Override
	public Patient addPatient(Patient objPatient) {
		return patientRepository.save(objPatient);
	}

	@Override
	public Patient updatePatient(Patient objPatient) {
		return patientRepository.save(objPatient);
	}

	@Override
	public void deletePatient(int id) {
		patientRepository.deleteById(id);
	}

}
