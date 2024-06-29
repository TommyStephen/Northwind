package study.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Suppliers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int supplierId;
	private String supplierName;
	private String contactName;
	private String address;
	private String city;
	private String postalCode;
	private String country;
	private String phone;
	
}
