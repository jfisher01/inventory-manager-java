package inventroyManager;
/**
 * This App class contains the main method and provides interactive console user-interface for this application.
 * Project's name is: Java Inventory Management System.  
 * The application uses CRUD - Create New, Read, Update and Delete operations - to 
 * create New Items like books,groceries and electronics. This application also 
 * views, updates, deletes items, creates inventory log file, and saves items in log file. 
 * It also reads Book, Grocery and Electronic Items from log file
 * 
 * @author Johnfisher Uchem
 * @version 1.0 / 12/15/2023
 * @since Java Inventory Management System 1.0
 */

public class App 
{
	/**
	 * Main method for this application
	 * @param args
	 */
	public static void main (String [] args)
	{
		
		//LAUNCH APP
		 new CLIInterface().userChoiseMenu();
		
	}

}
