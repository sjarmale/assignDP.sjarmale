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
		System.out.println("Do you to see the meat menu or produce menu?");
		Scanner sc = new Scanner(System.in);
		String menuType = sc.nextLine();
		if (menuType == "meat") {
			nProductCategory = 0;
		} else if (menuType == "produce") {
			nProductCategory = 1;
		}
		if (userType == 1) {
			Buyer buyer = new Buyer();
			ProductMenu productMenu = buyer.CreateProductMenu();
			buyer.showMenu();
		} else {
			Seller seller = new Seller();
			seller.CreateProductMenu();
			seller.showMenu();
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
