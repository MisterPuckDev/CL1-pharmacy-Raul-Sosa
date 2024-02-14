package pe.com.cibertec.cl1.pharmacy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "hospital")
public class Hospital {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hospitalId;
	private String hospitalName;
	private String hospitalAddress;
	private int hospitalPhoneNumber;
	private String state;
	private String zipCode;
	
}
