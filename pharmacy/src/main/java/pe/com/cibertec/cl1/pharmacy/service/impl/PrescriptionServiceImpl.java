package pe.com.cibertec.cl1.pharmacy.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.cibertec.cl1.pharmacy.model.Prescription;
import pe.com.cibertec.cl1.pharmacy.projections.ReportPrescriptionPatientC;
import pe.com.cibertec.cl1.pharmacy.repositories.PrescriptionRepository;
import pe.com.cibertec.cl1.pharmacy.service.PrescriptionService;

@Service
public class PrescriptionServiceImpl implements PrescriptionService {

	@Autowired
	PrescriptionRepository prescriptionRepository;

	@Override
	public List<Prescription> listPrescription() {
		return prescriptionRepository.findAll();
	}

	@Override
	public Prescription addPrescription(Prescription objPrescription) {
		return prescriptionRepository.save(objPrescription);
	}

	@Override
	public Prescription updatePrescription(Prescription objPrescription) {
		return prescriptionRepository.save(objPrescription);
	}

	@Override
	public void deletePrescription(int id) {
		prescriptionRepository.deleteById(id);
	}

	@Override
	public List<ReportPrescriptionPatientC> getReportPrescriptionPatient() {
		List<Object[]> listReport = prescriptionRepository.getReportPrescriptionPatient();
		List<ReportPrescriptionPatientC> finalList = new ArrayList<>();

		for (Object[] row : listReport) {
			Integer patientId = (Integer) row[0];
			String patientFName = (String) row[1];
			String patientLName = (String) row[2];
			double patientSubTotal = (double) row[3];
			ReportPrescriptionPatientC reporte = new ReportPrescriptionPatientC(patientId, patientFName, patientLName,
					patientSubTotal);
			finalList.add(reporte);
		}
		return finalList;
	}

}
