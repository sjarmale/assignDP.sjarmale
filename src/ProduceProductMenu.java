import java.util.ArrayList;

public class ProduceProductMenu implements ProductMenu {


	public void showMenu() {
		System.out.println("The meat products are as follows:");
		for (String product : products) {
			System.out.println("- " + product);
		}
	}

	@Override
	public ArrayList<String> addItems(String itemName) {
		ArrayList<String> newProducts = products;
		newProducts.add(itemName);
		return newProducts;
	}

	@Override
	public void showAddButton() {

	}

	@Override
	public void showViewButton() {

	}

	@Override
	public void showRadioButton() {

	}

	@Override
	public void showLabels() {

	}

	@Override
	public void showComboxes() {

	}
}
