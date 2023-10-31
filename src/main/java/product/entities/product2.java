package product.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity 
public class product2 {
	@Id
	public int id;
	public String Brand;
	public String Name;
	public int Price;
	public String Desc;
	
	product2()
	{
		
	}

	public product2(int id, String brand, String name, int price, String desc) {
		super();
		this.id = id;
		this.Brand = brand;
		this.Name = name;
		this.Price=price;
		this.Desc=desc;
	}
}
