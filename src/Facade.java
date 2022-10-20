import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Facade {

	private int userType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;
	public void beginFacade(){
		System.out.println("Hello, Facade pattern begins");
		userType= new Login().startLogin("SellerInfo.txt");
		login();
		System.out.println("Do you to see the meat menu or produce menu?");
		Scanner sc = new Scanner(System.in);
		String menuType = sc.nextLine();
		if (menuType.equals("meat")) {
			nProductCategory = 0;
		} else if (menuType.equals("produce")) {
			nProductCategory = 1;
		}

		// Demonstration of Bridge Design Pattern
		if (userType == 1) {
			thePerson = new Buyer();
			ProductMenu productMenu = thePerson.CreateProductMenu(nProductCategory);
			productMenu.showMenu();
		} else {
			thePerson = new Seller();
			ProductMenu productMenu = thePerson.CreateProductMenu(nProductCategory);
			productMenu.showMenu();
		}

		// Demonstration of Factory Design Pattern
		System.out.println();
		System.out.println("Factory Design Pattern... ");
		ProductMenuFactory productMenuFactory = new ProductMenuFactory();
		ProductMenu productMenu = productMenuFactory.makeProductMenu(nProductCategory);
		productMenu.showMenu();

		// Demonstration of Iterator Design Pattern
		ArrayList<String> products = new ArrayList<>();
		try {
			File myObj = new File("C:\\Users\\jarma\\IdeaProjects\\Design-Patterns-Siri\\src\\" + "ProductInfo.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String newData[] = data.split(":");
				String name = newData[1];
				products.add(name);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("Display all products using iterator design pattern... ");
		ProductIterator productIterator = new ProductIterator(products);
		productIterator.createIterator();
		while(productIterator.hasNext()) {
			productIterator.Next().forEach(
					(key, value) -> System.out.println(key + " : " + value)
			);
		}
	}


	public boolean login() {
		if (userType == 1) {
			System.out.println("Welcome Buyer");
			return true;
		} else if (userType == 0) {
			System.out.println("Welcome Seller");
			return true;
		} else {
			return false;
		}
	}

	public void addTrading() {

	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}

	public void remind() {

	}

	public void createUser() {

	}

	public void createProductList() {

	}

	public void AttachProductToUser() {

	}

	public Product SelectProduct() {
		return null;
	}

	public void productOperation() {

	}

}
