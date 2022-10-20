import java.util.ArrayList;

public interface ProductMenu {

	Person person=null;

	ArrayList<String> products = new ArrayList<>();

	public abstract void showMenu();

	public abstract ArrayList<String> addItems(String itemName);

	public abstract void showMenuIterator();

	public abstract void showAddButton();

	public abstract void showViewButton();

	public abstract void showRadioButton();

	public abstract void showLabels();

	public abstract void showComboxes();

}
