package pe.com.cibertec.cl1.pharmacy.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.cibertec.cl1.pharmacy.model.Prescription;

public interface PrescriptionRepository extends JpaRepository<Prescription, Integer> {

	@Query("SELECT pt.patientId, "
	        + "       pt.patientFName, "
	        + "       pt.patientLName, "
	        + "       sum(pc.prescriptionCost) "
	        + "FROM Patient pt "
	        + "INNER JOIN Prescription pc "
	        + "ON pt.patientId = pc.patient.patientId "
	        + "GROUP BY pt.patientId, "
	        + "         pt.patientFName, "
	        + "         pt.patientLName "
	        + "ORDER BY pt.patientId ASC")
	public List<Object[]> getReportPrescriptionPatient();

}
