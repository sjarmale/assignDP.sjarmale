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
