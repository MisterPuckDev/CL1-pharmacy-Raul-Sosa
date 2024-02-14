package pe.com.cibertec.cl1.pharmacy.service;

import java.util.List;

import pe.com.cibertec.cl1.pharmacy.model.Prescription;
import pe.com.cibertec.cl1.pharmacy.projections.ReportPrescriptionPatientC;

public interface PrescriptionService {

	public List<Prescription> listPrescription();

	public Prescription addPrescription(Prescription objPrescription);

	public Prescription updatePrescription(Prescription objPrescription);

	public void deletePrescription(int id);
	
	public List<ReportPrescriptionPatientC> getReportPrescriptionPatient();

}
