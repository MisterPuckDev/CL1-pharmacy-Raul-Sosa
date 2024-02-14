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

import pe.com.cibertec.cl1.pharmacy.model.Prescription;
import pe.com.cibertec.cl1.pharmacy.projections.ReportPrescriptionPatientC;
import pe.com.cibertec.cl1.pharmacy.service.PrescriptionService;

@RestController
@RequestMapping("/prescription")
public class PresciptionController {

	@Autowired
	PrescriptionService prescriptionService;

	@GetMapping
	public ResponseEntity<List<Prescription>> list() {
		return new ResponseEntity<>(prescriptionService.listPrescription(), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Prescription> add(@RequestBody Prescription objPrescription) {
		return new ResponseEntity<>(prescriptionService.addPrescription(objPrescription), HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<Prescription> update(@RequestBody Prescription objPrescription) {
		return new ResponseEntity<>(prescriptionService.updatePrescription(objPrescription), HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") int id) {
		prescriptionService.deletePrescription(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping("/report-prescription-patient")
	public ResponseEntity<List<ReportPrescriptionPatientC>> reportPrescriptionPatient() {
		return new ResponseEntity<>(prescriptionService.getReportPrescriptionPatient(), HttpStatus.OK);
	}

}
