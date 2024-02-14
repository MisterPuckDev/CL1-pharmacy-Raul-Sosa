package pe.com.cibertec.cl1.pharmacy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.cibertec.cl1.pharmacy.model.Patient;
import pe.com.cibertec.cl1.pharmacy.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	PatientService patientService;

	@GetMapping
	public ResponseEntity<List<Patient>> list() {
		return new ResponseEntity<>(patientService.listPatient(), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Patient> add(@RequestBody Patient objPatient) {
		return new ResponseEntity<>(patientService.addPatient(objPatient), HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<Patient> update(@RequestBody Patient objPatient) {
		return new ResponseEntity<>(patientService.updatePatient(objPatient), HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") int id) {
		patientService.deletePatient(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
