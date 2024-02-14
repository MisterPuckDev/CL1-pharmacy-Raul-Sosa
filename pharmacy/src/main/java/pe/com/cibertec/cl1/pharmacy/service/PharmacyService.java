package pe.com.cibertec.cl1.pharmacy.service;

import java.util.List;

import pe.com.cibertec.cl1.pharmacy.model.Pharmacy;

public interface PharmacyService {

	public List<Pharmacy> listPharmacy();

	public Pharmacy addPharmacy(Pharmacy objPharmacy);

	public Pharmacy updatePharmacy(Pharmacy objPharmacy);

	public void deletePharmacy(int id);

}
