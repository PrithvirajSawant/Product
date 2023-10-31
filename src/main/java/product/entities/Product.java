package product.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
	public int id;
	public String Brand;
	public String Name;
	
	Product()
	{
		
	}

	public Product(int id, String brand, String name) {
		super();
		this.id = id;
		this.Brand = brand;
		this.Name = name;
	}
}