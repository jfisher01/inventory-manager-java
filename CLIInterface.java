package inventroyManager;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Client interface class provides operation interface for the entire application and 
 * extends InventoryManager class
 * @author Johnfisher Uchem
 * @version 1.0 / 12/15/2023
 * @since Java Inventory Management System 1.0
 *
 */
public class CLIInterface extends InventoryManager
{
	
	Scanner keyboardInput = new Scanner(System.in);
	
	/**
	 * Non-parametric constructor for CLIInterface class
	 */
	public CLIInterface() 
	{
		super();
	}
	
	
	/**
	 * Parametric constructor for CLIInterface class
	 * @param items
	 * @param inventoryFile
	 * @param fileName
	 */
	public CLIInterface(ArrayList<Items> items, File inventoryFile, String fileName) 
	{
		super(items, inventoryFile, fileName);
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * shows menu for CRUD - Create New, Read, Update and Delete operations 
	 * showMeny void method
	 */
	public void showMenu()
	{
	String appMenu = "1. Add new item\n" + "2. View items\n" + "3. Update item\n" 
	                  + "4. Delete item\n" + "5. Save inventory log\n" + "6. Exit";
	
	System.out.println("\nWELCOME TO THE JAVA INVENTORY MANAGEMENT SYSTEM!\n" + 
						"..................................................." + 
						"\nPLEASE CHOOSE AN OPTION: ");
	System.out.println(appMenu);
	
	}
	
	
	
	/**
	 * Provides method calls for CRUD operations
	 * userChoiceMenu void method
	 */
	public void userChoiseMenu()
	{
		InventoryManager anyItem = new InventoryManager();
		
			int userChoice =1;
	
		do {
			showMenu();
			userChoice++;
		
		try {
			 userChoice = keyboardInput.nextInt();
			
			switch(userChoice)
			{
			case 1 ://Add new items
					anyItem.addNewItem();
					break;
					
			case 2: //View inventory items or inventory log
					System.out.println("Enter 1 to view inventory item(s): \n"
										+ "Enter 2 to view inventory log\n");
					
					userChoice = keyboardInput.nextInt();
					
					if(userChoice == 1)
					{
						//anyItem.viewItem(items);
						System.out.println(anyItem.getItems());
					}
					
					else
					{   
						readAndViewInventoryLog();
					}
					break;
					
			case 3: //Update item
					anyItem.updateItem();
					break;
				
			case 4: //delete item
					//anyItem.clear(); to clear all items in the inventory
					//The above function was not included in the menu to keep things simple
					anyItem.remove();
					break;
						
			case 5: //Save item(s) to inventory log file
					anyItem.saveInventoryLog(anyItem.getFileName());
					break;
					
			default ://Default 
					//System.out.println("Wrong input!"); Just left default blank
					break;
			
			}			
			
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
		System.out.println("Wrong input!\n");
			System.exit(0);
		
		}
		
	}while(userChoice > 0 && userChoice < 6 );
		System.out.println("Thank you for using JIMS. Goodbye!");
	
}
}
