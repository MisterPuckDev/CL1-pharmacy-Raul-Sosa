package pe.com.cibertec.cl1.pharmacy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.com.cibertec.cl1.pharmacy.model.Pharmacy;

public interface PharmacyRepository extends JpaRepository<Pharmacy, Integer> {

}
