package inventroyManager;
/**
 * This Provides interface for Items class
 * 
 * @author Johnfisher Uchem
 * @version 1.0 / 12/15/2023
 * @since Java Inventory Management System 1.0
 *
 */
public interface Item 
{

	public String getId();
	public String getName();
	public int getQuantity();
	public double getPrice();
	public String getCategory();
	public String toString();
}
