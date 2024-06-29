package study.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Data;

@Entity
@Data
public class Employees {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;
	private String lastName;
	private String firstName;
	private LocalDate birthDate;
	@Lob
	@Column(columnDefinition = "BLOB")
	private String photo;
	@Column(length = 2000)
	private String notes;
}
