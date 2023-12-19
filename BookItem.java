package inventroyManager;

/**
 * BookItem class extends Items class, implements Item Interface and represents book items
 * 
 * @author Johnfisher Uchem
 * @version 1.0 / 12/15/2023
 * @since Java Inventory Management System 1.0
 */
public class BookItem extends Items implements Item 
{

	private String author;
	
	/**
	 * Non-parametric constructor for BookItem class
	 */
	public BookItem()
	{
		super();
	}
	
	
	/**
	 * Parametric constructor for BookItem class
	 * @param id
	 * @param name
	 * @param quantity
	 * @param price
	 * @param category
	 * @param author
	 */
	public BookItem(String id, String name, int quantity, double price, String category, String author) 
	{
		super(id, name, quantity, price, category);
		this.author = author;
		// TODO Auto-generated constructor stub
	}

	/**
	 * Sets the book's id 
	 * @param id the id parameter in setId method
	 */
	public void setId(String id) 
	{
		this.id = id;
	}

	/**
	 * Sets the book's name
	 * @param name the name parameter in the setName method
	 */
	public void setName(String name) 
	{
		this.name = name;
	}

	/**
	 * Sets the book's quantity 
	 * @param quantity the quantity parameter in the setQuantity method
	 */
	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}

	/** 
	 * Sets the book's price
	 * @param price the price parameter in the setPrice method
	 */
	public void setPrice(double price) 
	{
		this.price = price;
	}

	/**
	 * Sets the book's category
	 * @param category the category parameter in setCatogory method
	 */
	public void setCategory(String category) 
	{
		this.category = category;
	}
	
	
	
	/**
	 * Gets the book's author
	 * @return the author, getAuthor method
	 */
	public String getAuthor() 
	{ 
		return author;
	}


	/**
	 * Sets the book's author
	 * @param author the author parameter in the setAuthor method
	 */
	public void setAuthor(String author) 
	{
		this.author = author;
	}


	/**
	 * Gets the book's id
	 * @return Id, getId method
	 */
	@Override
	public String getId() 
	{
		// TODO Auto-generated method stub
		return id;
	}
	
	/**
	 * Gets the book's name
	 * @return name, getName method
	 */
	@Override
	public String getName() 
	{
		// TODO Auto-generated method stub
		return name;
	}
	
	/**
	 * Gets the book's quantity
	 * @return quantity, getQuantity method
	 */
	@Override
	public int getQuantity() 
	{
		if(quantity < 0)
		{
			System.out.println("Quantity cannot be less than 0");
			return quantity;
		}
	else
		{
			 return quantity;
		}
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Gets the book's price
	 * @return price, getPrice method
	 */
	@Override
	public double getPrice() 
	{
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
	 * Gets the book's category
	 * @return category, getCategory method
	 */
	@Override
	public String getCategory() 
	{
		// TODO Auto-generated method stub
		return category;
	}
	
	/**
	 * Returns toString values of the constructor of BookItem class
	 * @return values from toString method
	 */
	@Override
	public String toString() 
	{
			
		return ("BOOK ITEMS :\n" + "ID: " + id + "\nName: " + name + "\nQuantity: " + quantity + "\nPrice: " + fdollar.format(price)
				+ "\nCategory: " + category + "\nAuthor: " + author + "\n");
	}

}
