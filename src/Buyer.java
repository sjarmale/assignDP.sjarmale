import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;

public class Buyer extends Person {

	// Concrete implementation of Person abstract class
	ArrayList<String> menuList = new ArrayList<String>();

	public void showMenu() {
		System.out.println();
	}

	//Product menu corresponding to the Buyer object
	public ProductMenu CreateProductMenu(int productCategory) {
		ProductMenu productMenu;
		if (productCategory == 0) {
			productMenu = new MeatProductMenu();
		} else {
			productMenu = new ProduceProductMenu();
		}
		try {
			File myObj = new File("C:\\Users\\jarma\\IdeaProjects\\Design-Patterns-Siri\\src\\" + "ProductInfo.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String newData[] = data.split(":");
				String type = newData[0];
				String name = newData[1];
				if ((productCategory == 1 && type.equals("Produce")) || (productCategory == 0 && type.equals("Meat"))) {
					productMenu.addItems(name);
				}
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return productMenu;
	}
}
