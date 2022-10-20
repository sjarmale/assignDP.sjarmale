import java.util.ArrayList;
import java.util.HashMap;

public class ProductIterator implements ListIterator {

	ArrayList<String> productMenu;

	int maxSize = 10;

	int index = 0;

	public ProductIterator(ArrayList<String> newProductMenu) {
		productMenu = new ArrayList<>(maxSize);
		for(int r=0; r<newProductMenu.size(); r++) {
			productMenu.add(newProductMenu.get(r));
		}
	}
	@Override
	public boolean hasNext() {
		if(index < productMenu.size() &&
				productMenu.get(index) != null)
			return true;
		else
			return false;
	}

	@Override
	public HashMap<Integer, String> Next() {
		String product = productMenu.get(index);
		index++;
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(index, product);
		return map;
	}

	@Override
	public void MoveToHead() {
		index = 0;
	}

	@Override
	public void Remove() {

	}

	@Override
	public ListIterator createIterator() {
		return new ProductIterator(productMenu);
	}
}
