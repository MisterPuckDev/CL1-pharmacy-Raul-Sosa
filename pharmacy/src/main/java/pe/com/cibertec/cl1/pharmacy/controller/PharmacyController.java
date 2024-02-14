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

import pe.com.cibertec.cl1.pharmacy.model.Pharmacy;
import pe.com.cibertec.cl1.pharmacy.service.PharmacyService;

@RestController
@RequestMapping("/pharmacy")
public class PharmacyController {

	@Autowired
	PharmacyService pharmacyService;

	@GetMapping
	public ResponseEntity<List<Pharmacy>> list() {
		return new ResponseEntity<>(pharmacyService.listPharmacy(), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Pharmacy> add(@RequestBody Pharmacy objPharmacy) {
		return new ResponseEntity<>(pharmacyService.addPharmacy(objPharmacy), HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<Pharmacy> update(@RequestBody Pharmacy objPharmacy) {
		return new ResponseEntity<>(pharmacyService.updatePharmacy(objPharmacy), HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") int id) {
		pharmacyService.deletePharmacy(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
