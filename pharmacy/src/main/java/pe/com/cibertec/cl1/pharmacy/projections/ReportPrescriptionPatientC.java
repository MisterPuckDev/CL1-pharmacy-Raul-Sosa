package pe.com.cibertec.cl1.pharmacy.projections;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportPrescriptionPatientC {
	public Integer patientId;

	public String patientfname;

	public String patientlname;

	public double prescriptionCost;
}
