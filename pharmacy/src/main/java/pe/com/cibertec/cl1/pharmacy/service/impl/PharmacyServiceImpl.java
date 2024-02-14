package pe.com.cibertec.cl1.pharmacy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.cibertec.cl1.pharmacy.model.Pharmacy;
import pe.com.cibertec.cl1.pharmacy.repositories.PharmacyRepository;
import pe.com.cibertec.cl1.pharmacy.service.PharmacyService;

@Service
public class PharmacyServiceImpl implements PharmacyService {

	@Autowired
	PharmacyRepository pharmacyRepository;

	@Override
	public List<Pharmacy> listPharmacy() {
		return pharmacyRepository.findAll();
	}

	@Override
	public Pharmacy addPharmacy(Pharmacy objPharmacy) {
		return pharmacyRepository.save(objPharmacy);
	}

	@Override
	public Pharmacy updatePharmacy(Pharmacy objPharmacy) {
		return pharmacyRepository.save(objPharmacy);
	}

	@Override
	public void deletePharmacy(int id) {
		pharmacyRepository.deleteById(id);
	}

}
