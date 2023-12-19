package inventroyManager;

/**
 * ElectronicItem class extends Items class, implements Item Interface and represents electronic items.
 * 
 * @author Johnfisher Uchem
 * @version 1.0 / 12/15/2023
 * @since Java Inventory Management System 1.0
 */
public class ElectronicItem extends Items implements Item 
{
	
	private String brandName ;
	
	/**
	 * Non-parametric constructor for this class
	 */
	public ElectronicItem()
	{
		super();
	}
	

	/**
	 * Parametric constructor for this class
	 * @param id
	 * @param name
	 * @param quantity
	 * @param price
	 * @param category
	 * @param brandName
	 */
	public ElectronicItem(String id, String name, int quantity, double price, String category, String brandName) 
	{
		super(id, name, quantity, price, category);
		this.brandName = brandName;
		// TODO Auto-generated constructor stub
	}



	/**
	 * Sets the electronic's id
	 * @param id the id in setId method's parameter
	 */
	public void setId(String id) 
	{
		this.id = id;
	}

	/**
	 * Sets the electronic's name
	 * @param name the name in setName setName method's parameter
	 */
	public void setName(String name) 
	{
		this.name = name;
	}

	/**
	 * Sets the eletronic's quantity
	 * @param quantity the quantity in the setQuantity method's parameter
	 */
	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}

	/**
	 * Sets the electronic's price
	 * @param price the price in the setPrice method's parameter
	 */
	public void setPrice(double price) 
	{
		this.price = price;
	}

	/**
	 * Sets the eletronic's category
	 * @param category the category in the setCategory method's parameter
	 */
	public void setCategory(String category) 
	{
		this.category = category;
	}
	
	

	/**
	 * Gets the brand name
	 * @return the brandName
	 */
	public String getBrandName() 
	{
		return brandName;
	}


	/**
	 * Sets the brand name
	 * @param brandName the brandName in the setBrandName method's parameter
	 */
	public void setBrandName(String brandName) 
	{
		this.brandName = brandName;
	}



	/**
	 * Gets the eletronic's Id
	 * @return Id, getId method
	 */
	@Override
	public String getId() 
	{
		// TODO Auto-generated method stub
		return id;
	}

	/**
	 * Gets the electronic's name
	 * @return name, getName method
	 */
	@Override
	public String getName() 
	{
		// TODO Auto-generated method stub
		return name;
	}
    
	
	/**
	 * Gets the electronic's quantity
	 * @return quantity, getQuantity method
	 */
	@Override
	public int getQuantity() 
	{
		// TODO Auto-generated method stub
		if(quantity < 0)
		{
			System.out.println("Quantity cannot be less than 0");
			return quantity;
		}
	else
		{
			 return quantity;
		}	
	}

	/**
	 * Gets the eletronic's price
	 * @return price, getPrice method
	 */
	@Override
	public double getPrice() 
	{
		// TODO Auto-generated method stub
		if(price < 0)
		{
			System.out.println("Price cannot be less than 0");
			return price;
		}
	else
		{
			 return price;
		}
		// TODO Auto-generated method stub	
	}

	/**
	 * Gets the electronic's category
	 * @return category, getCategory method
	 */
	@Override
	public String getCategory() 
	{
		// TODO Auto-generated method stub
		return category;
	}
	
	/**
	 * Returns the toString values of the electronic item
	 * toString void method
	 */
	@Override
	public String toString() 
	{
		
		return ("ELECTRONIC ITEMS :\n" + "ID: " + id + "\nName: " + name + "\nQuantity: " + quantity + "\nPrice: " + fdollar.format(price)
				+ "\nCategory: " + category + "\nBrand Name: " + brandName + "\n");
	}
	
}
