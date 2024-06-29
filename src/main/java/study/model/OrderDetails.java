package study.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class OrderDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderDetailId;
	
	@ManyToOne
	@JoinColumn(name = "orderId", referencedColumnName = "orderId")
	private Orders order;
	
	@ManyToOne
	@JoinColumn(name="productId", referencedColumnName = "productId")
	private Products product;
	
	private int quantity;
	
}
