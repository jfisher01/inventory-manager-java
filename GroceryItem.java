package inventroyManager;

/**
 * GroceryItem class extends Items class, implements Item Interface and represents grocery items
 * 
 * @author Johnfisher Uchem
 * @version 1.0 / 12/15/2023
 * @since Java Inventory Management System 1.0 
 *
 */
public class GroceryItem extends Items implements Item 
{
	
	/**
	 * @param non-parameter constructor for this class
	 */
	public GroceryItem()
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
	 */
	public GroceryItem(String id, String name, int quantity, double price, String category) 
	{
		super(id, name, quantity, price, category);
		// TODO Auto-generated constructor stub
	}


	/**
	 * Sets id for the grocery item
	 * @param id the id in the setId method's parameter 
	 */
	public void setId(String id) 
	{
		this.id = id;
	}

	/**
	 * Sets name for the grocery item
	 * @param name the name in the setName method's parameter
	 */
	public void setName(String name) 
	{
		this.name = name;
	}

	/**
	 * Sets grocery item's quantity 
	 * @param quantity the quantity in the setQuantity method's parameter
	 */
	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}

	/**
	 * Sets grocery item's price
	 * @param price the price in the setPrice method's parameter
	 */
	public void setPrice(double price) 
	{
		this.price = price;
	}

	/**
	 * Sets grocery item's category
	 * @param category the category in the setCategory method's parameter
	 */
	public void setCategory(String category) 
	{
		this.category = category;
	}
	
	/**
	 * Gets id for the grocery item
	 * @return id, getId method
	 */
	@Override
	public String getId() 
	{
		// TODO Auto-generated method stub
		return id;
	}
	
	/**
	 * Gets grocery item's name
	 * @return name, getName method
	 */
	@Override
	public String getName() 
	{
		// TODO Auto-generated method stub
		return name;
	}
	
	/**
	 * Gets grocery items quantity
	 * @return quantity, getQuantity method
	 */
	@Override
	public int getQuantity() 
	{
		// TODO Auto-generated method stub
		return quantity;
	}
	
	/**
	 * Gets grocery items price
	 * @return price, getPrice method
	 */
	@Override
	public double getPrice() 
	{
		// TODO Auto-generated method stub
		return price;
	}
	
	/**
	 * Gets grocery items category
	 * @return category, getCategory method
	 */
	@Override
	public String getCategory() 
	{
		// TODO Auto-generated method stub
		return category;
	}
	
	/**
	* Returns toString values of the constructor of GroceryItem class
	 * @return values from toString method
	 */
	@Override
	public String toString() 
	{
			
		return ("GROCERY ITEMS :\n" + "ID: " + id + "\nName: " + name + "\nQuantity: " + quantity + "\nPrice: " + fdollar.format(price)
				+ "\nCategory: " + category + "\n");
	}

	
}
