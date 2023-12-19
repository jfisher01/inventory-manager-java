/**
 * 
 */
package inventroyManager;

import java.text.NumberFormat;

/**
 * Items class implements Item Interface, represents concrete and base class 
 * for GroceryItem, BookItem and ElectronicItem classes
 * 
 * @author Johnfisher Uchem
 * @version 1.0 / 12/15/2023
 * @since Java Inventory Management System 1.0
 *
 */ 
public class Items implements Item  //Concrete class for re-use of instance variables in other three derived classes
{
	//Currency formatter used in this project
	NumberFormat fdollar = NumberFormat.getCurrencyInstance();

	protected String id;
	protected String name;
	protected int quantity;
	protected double price;
	protected String category;
	
	/**
	 * Non-parametric constructor for Items class
	 */
	public Items()
	{
		
	}
	
	/**
	 * parametric constructor for Items class
	 * @param id
	 * @param name
	 * @param quantity
	 * @param price
	 * @param category
	 */
	public Items(String id, String name, int quantity, double price, String category) 
	{
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.category = category;
	}
	
	
	/**
	 * Gets id for items
	 * @return the id from getId method
	 */
	@Override
	public String getId() 
	{
		return id;
	}
	
	/**
	 * Sets id for Items
	 * @param id, the id in the setId method's parameter
	 */
	public void setId(String id) 
	{
		this.id = id;
	}
	
	/**
	 * Gets name for items
	 * @return the name from getName method
	 */
	@Override
	public String getName() 
	{
		return name;
	}
	
	/**
	 * Sets item's name
	 * @param name,sets name for setName method
	 */
	public void setName(String name) 
	{
		this.name = name;
	}
	
	/**
	 * Gets quantity of Items
	 * @return the quantity from the getQuantity method
	 */
	@Override
	public int getQuantity() 
	{
		return quantity;
	}
	
	/**
	 * Sets quantity for the Items
	 * @param quantity the quantity in the setQuantity method's parameter
	 */
	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}
	
	
	/**
	 * Gets price of the Items
	 * @return the price
	 */
	@Override
	public double getPrice() 
	{
		return price;
	}
	
	
	/**
	 * Sets price for Items
	 * @param price the price in the setPrice method's parameter
	 */
	public void setPrice(double price) 
	{
		this.price = price;
	}
	
	/**
	 * Gets category for Items
	 * @return the category
	 */
	@Override
	public String getCategory() 
	{
		return category;
	}
	
	/**
	 * Sets category for Items
	 * @param category the category in the setCategory method'sparameter
	 */
	public void setCategory(String category) 
	{
		this.category = category;
	}
	
	/**
	 * 
	 * @return values from toString method
	 */
	public String toString() 
	{
		return ("ITEMS :\n" + "ID: " + id + "\nName: " + name + "\nQuantity: " + quantity + "\nPrice: " + price
				+ "\nCategory: " + category + "\n" );
	}

	
}
