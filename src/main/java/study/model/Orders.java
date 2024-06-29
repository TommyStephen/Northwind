package study.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	private LocalDate orderDate;
	
	@ManyToOne
	@JoinColumn(name = "customerId", referencedColumnName = "customerId")
	private Customers customer;
	
	@ManyToOne
	@JoinColumn(name = "employeeId", referencedColumnName = "employeeId")
	private Employees employee;
	
	@ManyToOne
	@JoinColumn(name = "shipperId", referencedColumnName = "shipperId")
	private Shippers shipper;
	
	@OneToMany(mappedBy = "order")
	private List<OrderDetails> orderDetails;
}
