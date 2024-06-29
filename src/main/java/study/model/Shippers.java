package study.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Shippers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int shipperId;
	private String shipperName;
	private String phone;
}
