import java.util.ArrayList;

public class MeatProductMenu implements ProductMenu {

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
	public void showMenuIterator() {

	}

	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showComboxes() {

	}

}
