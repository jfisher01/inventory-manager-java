package inventroyManager;

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

/**
 * This class controls inventory operations, manages BookItem,GroceryItem and ElectronicItem classes inventories 
 * and provides CRUD - Create New, Read, Update and Delete - operations.
 * 
 * @author Uchechukwu Johnfisher Uchem
 * @version 1.0 / 12/15/2023
 * @since Java Inventory Management System 1.0
 */
public class InventoryManager 
{
	private ArrayList<Items> items = new ArrayList<Items>();
	private File inventoryFile;
	private String fileName = "inventory.log";
	
	//External class objects used in this class
	BookItem book = new BookItem();
	ElectronicItem electronic = new ElectronicItem();
	GroceryItem grocery = new GroceryItem();
	Items anyItem = new Items();
	
	Scanner keyboardInput = new Scanner(System.in);

	/**
	 * Non-parametric constructor for this class
	 */
	public InventoryManager() 
	{

	}

	/**
	 * Parametric Constructor for this class
	 * @param items
	 * @param inventoryFile
	 * @param fileName
	 * @param anyItem
	 */
	public InventoryManager(ArrayList<Items> items, File inventoryFile, String fileName) //To generate arraylist, etc, getters and setters
	{
		super();
		this.items = items;
		this.inventoryFile = inventoryFile;
		this.fileName = fileName;

	}

	/**
	 * Gets file name
	 * @return the fileName 
	 */
	public String getFileName() 
	{
		return fileName;
	}

	
	/**
	 * Sets file name
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) 
	{
		this.fileName = fileName;
	}

	/**
	 * Gets inventory file
	 * @return the inventoryFile
	 */
	public File getInventoryFile() 
	{

		return inventoryFile;
	}

	
	/**
	 * Sets inventory file 
	 * @param inventoryFile the inventoryFile in the setInventoryFile method's parameter
	 */
	public void setInventoryFile(File inventoryFile) 
	{
		this.inventoryFile = inventoryFile;
	}

	/**
	 * Adds items to the list
	 * @param anyItem the anyItem in the addItem method's parameter
	 * @return anyItem
	 */
	public Items addItem(Items anyItem) 
	{
		items.add(anyItem);
		System.out.println(anyItem.getClass().getSimpleName() + " was added successfully!\n");

		return anyItem;
	}
	
	
	/**
	 * Removes items from list
	 * Void remove method
	 */
	public  void remove() 
	{
		System.out.println("Enter item's id");
		String Itemid = keyboardInput.next();
		
		for(Items anyItem: items)
		{
		if(anyItem.getId().equals(Itemid)) 
		{
				items.remove(anyItem);
		System.out.println(anyItem.getClass().getSimpleName() + " was removed successfully!\n");
		break;
		}
		else
		{
			System.out.println("Item not found!");
			
			break;
		}
		}
	}

	/**
	 * Clears items from list
	 * Void clear method
	 * @see java.util.ArrayList#clear()
	 */
	public void clear() 
	{
		System.out.println("Item is removed successfully");
		items.clear();
	}

	
	/**
	 * Creates and adds new items to list
	 * void function addNewItem method
	 */
	public void addNewItem() 
	{
		int numberOfItems = 0;
		int selectNumber;
		
		String id = "";
		String name = "";
		int quantity = 0;
		double price = 0.00;
		String category = "";
		String brand = "";
		String author = "";
	
		System.out.println("Enter 1 to add an item\n");
		numberOfItems = keyboardInput.nextInt();
		
		
		do {
			
			System.out.println("Select a number for item's type or 4 to exit");
			
			System.out.println("1. Book item " + "\n2. Electronic item" + "\n3. Grocery item\n" + "4. to exit");
			
			selectNumber = keyboardInput.nextInt();
		
			for (int i = 0; i < numberOfItems;) 
			{
		
			if(selectNumber == 1) 
			{
				try {
					keyboardInput.nextLine();
					System.out.println("Enter item's Id: ");
					id = keyboardInput.nextLine();

					System.out.println("Enter item's name: ");
					name = keyboardInput.nextLine();

					System.out.println("Enter item's quantity: ");
					quantity = keyboardInput.nextInt();

					System.out.println("Enter item's price: ");
					price = keyboardInput.nextDouble();

					keyboardInput.nextLine();
					System.out.print("Enter item's category: \n");
					category = keyboardInput.nextLine();
					
					System.out.print("Enter item's author: ");
					author = keyboardInput.nextLine();

					book = new BookItem(id, name, quantity, price, category, author);

					// Adds new item to inventory
					addItem(book);
				
				} 
				catch (Exception e) 
				{
					// TODO Auto-generated catch block
					System.out.println("Input mismatch!");
					System.exit(0);
				}
				break;
			}
			
		else if(selectNumber == 2) 
			{
		
				try {
					keyboardInput.nextLine();
					
					System.out.println("Enter item's Id: ");
					id = keyboardInput.nextLine();

					System.out.println("Enter item's name: ");
					name = keyboardInput.nextLine();

					System.out.println("Enter item's quantity: ");
					quantity = keyboardInput.nextInt();

					System.out.println("Enter item's price: ");
					price = keyboardInput.nextDouble();
					
					keyboardInput.nextLine();
					System.out.print("Enter item's category: ");
					category = keyboardInput.nextLine();

					System.out.print("Enter item's brand: ");
					brand = keyboardInput.nextLine();
					
					electronic = new ElectronicItem(id, name, quantity, price, category, brand);

					// Adds new item to inventory
					addItem(electronic);
					
					} 
				catch (Exception e) 
					{
					// TODO Auto-generated catch block
					System.out.println("Input mismatch!");
					System.exit(0);
					}
					break;
					}
		else if(selectNumber == 3) 
					{
			
				try {	
						keyboardInput.nextLine();
					
					  System.out.println("Enter item's Id: "); 
					  id = keyboardInput.nextLine();
					  
					  System.out.println("Enter item's name: "); 
					  name = keyboardInput.nextLine();
					  
					  System.out.println("Enter item's quantity: "); 
					  quantity = keyboardInput.nextInt();
					  
					  System.out.println("Enter item's price: "); 
					  price = keyboardInput.nextDouble();
					  
					  keyboardInput.nextLine();
					  System.out.print("Enter item's category: "); 
					  category = keyboardInput.nextLine();
					 
					grocery = new GroceryItem(id, name, quantity, price, category);

					// Adds new item to inventory
					addItem(grocery);
					
				} 
				catch (Exception e) 
				{
					// TODO Auto-generated catch block
					System.out.println("Input mismatch!");
					System.exit(0);
				}
				break;
				}
		else {
				System.out.println("Exit or wrong selection!");
				
			}
			break;
			}
			
		}while(selectNumber >0 && selectNumber < 4);
		System.out.println("You exited addNewItem function!");
	}
	
	
	

	/**
	 * Creates inventory log file if no file exists or deleted
	 * createFile void function
	 */
	public void createFile() 
	{

		try {

			inventoryFile = new File(fileName);

			if (inventoryFile.createNewFile())
			{
				System.out.println("File created: " + inventoryFile.getName());
			}

			else 
			{
				System.out.println("File already exists.");
			}
			
		}
		catch (IOException e) 
		{
			System.out.println("An error occurred.");

			System.out.println(e.getMessage());
		}
	}
	
	
	/**
	 * Reads and prints inventory log file contents
	 * readAndViewInentory void function 
	 */
	public void readAndViewInventoryLog() 
	{
		Scanner file = null;

		try {
			file = new Scanner(new FileInputStream(fileName));
			
			if (!file.hasNextLine() || file.equals(null))
			{

				System.out.println("Inventory log is empty\n");
			}
			
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("FileNotFoundException has occurred!");
			
			System.exit(0);
		}

		while (file.hasNextLine() == true) 
		{
			String inventoryLog = file.nextLine();
			
			System.out.println(inventoryLog);
		}

		file.close();
	}
	
	/**
	 * Saves inventory logs in log file
	 * @param fileName void function, fileName in saveInventoryLog method's parameter
	 */	
	public void saveInventoryLog(String fileName) 
	{
		fileName = this.fileName;

		if (items.isEmpty()) 
		{
			System.out.println("Inventory log file " + getFileName() + " is empty\n");

		} 
	else 
		{
		try (PrintWriter printwriter = new PrintWriter(new FileWriter(fileName, true)))
		{
			printwriter.println(items);

			System.out.println("This category was appended to the file.\n");
			
			printwriter.close();
			} 
		
		catch (IOException e) 
		{
			System.out.println(e.getMessage());
		}
		
		}
	}

	/**
	 * Sets items list
	 * @param items the items in setItems method's parameter
	 */
	public void setItems(ArrayList<Items> items) 
	{
		this.items = items;
	}

	/**
	 * Gets items in the list
	 * @return the items from getItems method
	 */
	public ArrayList<Items> getItems() 
	{
		if (items.isEmpty()) 
		{
			System.out.println("Inventory is empty\n");

			return items;
		}		
		  return items;	
	}
	
	/**
	 * Views items in the list
	 * @param anyItem, void function
	 */
	 public void viewItem(Items anyItem) 
	 {	  
	 if(items.isEmpty()) 
	  { 
		  System.out.println("Inventory is empty\n"); 
	  }
	  else
	  {
	  for (Items allItems : items) 
	  {	  
	  System.out.println(allItems);
	  
	  }
	  
	  } 
	 }
	
	 
	 /**
	  * Shows menu options to update items
	  * showUpdateMenu void function
	  */
	 public void showUpdateMenu()
		{
			String updateMenu = "Enter 1 to update item's Id: \n" + "2 to update Name: \n" + 
					"3 to update quantity: \n" + "4 to update price: \n" + "5 to update category\n" +
					"6 to update item's author: \n" + "7 to update item's brand: \n" + "8 to exit items update!: ";
			
			System.out.println(updateMenu);
		}

	 
	  
	/**
	 * Updates items
	 * updateItem void function  
	 */
	
	  public void updateItem() 
	  { 
		  String itemId = "";
		  
		  int userNumber = 0;
		  
		try {
			do {
				
					try {
						System.out.println("Pleaase enter the items Id");
						itemId = keyboardInput.next();
						
					} 
					catch (Exception e)
					{
						// TODO Auto-generated catch block
						System.out.println("Input mismatch!");
						System.exit(0);
					}
					
					if(items.isEmpty() )
					{
						System.out.println("The inventory is empty! or no such item");
						break;
					}

					else
					{
					
					showUpdateMenu();
					
						System.out.println("Enter an option ");
						try {
							userNumber = keyboardInput.nextInt();
						} 
						
						catch (Exception e){
							// TODO Auto-generated catch block
							System.out.println("Input mismatch!");
							System.exit(0);
						}
							}
							
							for(Items thisItem: items)
							{ 
								
						switch (userNumber)
							{			
						case 1:
							System.out.println("Enter item's id: ");
							try {
								String newId = keyboardInput.next();
								
									if(thisItem.getId().equals(itemId))
									{
									thisItem.setId(newId);
									break;
									}
									System.out.println("Item, not found!");
								 break;
							} 
							catch (Exception e) 
							{
								// TODO Auto-generated catch block
								System.out.println("Input mismatch!");
								System.exit(0);
							}
					case 2:
							System.out.println("Enter item's name: ");
							try {
								String newName = keyboardInput.next();

								if(thisItem.getId().equals(itemId))
								{
									thisItem.setName(newName);
									break;
								}
								System.out.println("Item, not found!");
								break;
							} 
							catch (Exception e) 
							{
								// TODO Auto-generated catch block
								System.out.println("Input mismatch!");
								System.exit(0);
							}
					case 3:
							System.out.println("Enter item's quantity: ");
							try {
								int newQuantity = keyboardInput.nextInt();

								if(thisItem.getId().equals(itemId))
								{
									thisItem.setQuantity(newQuantity);
									break;
								}
								System.out.println("Item, not found!");
							} 
							catch (Exception e) 
							{
								// TODO Auto-generated catch block
								System.out.println("Input mismatch!");
								System.exit(0);
							}
						
						   	break;
					case 4:
							System.out.println("Enter item's price: ");
							
							try {
								double newPrice = keyboardInput.nextDouble();

								if(thisItem.getId().equals(itemId))
								{
									thisItem.setPrice(newPrice);
									break;
								}
								System.out.println("Item, not found!");
								break;
							} 
							catch (Exception e) 
							{
								// TODO Auto-generated catch block
								System.out.println("Input mismatch!");
								System.exit(0);
							}
						   	break;
					case 5:
							System.out.println("Enter item's category: ");
							try {
								String newCategory = keyboardInput.next();

								if(thisItem.getId().equals(itemId))
								{
									thisItem.setCategory(newCategory);
									break;
								}
								System.out.println("Item, not found!");
								break;
							} catch (Exception e) {
								// TODO Auto-generated catch block
								System.out.println("Input mismatch!");
								System.exit(0);
							}
					case 6:		
							System.out.println("Enter item's author: ");
						try {
							String newAuthor = keyboardInput.next();

							if(thisItem.getId().equals(itemId))
							{
								book.setAuthor(newAuthor);

								break;
							}
							System.out.println("Item, not found!");
							break;
						} 
						catch (Exception e) 
						{
							// TODO Auto-generated catch block
							System.out.println("Input mismatch!");
							System.exit(0);
						}
						
					case 7:			
						System.out.println("Enter item's brand: ");
						try {
							String newBrandName = keyboardInput.next();

							if(thisItem.getId().equals(itemId))
							{
								electronic.setBrandName(newBrandName);
								break;
							}
							System.out.println("Item, not found!");
							break;
						} 
						catch (Exception e) 
						{
							// TODO Auto-generated catch block
							System.out.println("Input mismatch!");
							System.exit(0);
						}
					default:
							System.out.println("Enter correct number\n");
							break;
					
							}
					System.out.println("Item updated successfully");
					}
					break;
				
			}	while(userNumber >= 0 && userNumber <= 7);
				System.out.println("You exited item(s) update");
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			System.out.println("An error has occurred!");
			System.exit(0);
		}
		
			
		}
		

	/**
	 * 
	 */
	@Override
	public String toString() 
	{
		return ("Items: " + items.toString() );

	}
}

