import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Buyer extends Person {

	public void showMenu() {
		System.out.println();
	}

	public ProductMenu CreateProductMenu() {
		try {
			File myObj = new File("C:\\Users\\jarma\\IdeaProjects\\Design-Patterns-Siri\\src\\" + "ProductInfo.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String newData[] = data.split(":");
				String userName = newData[0];
				String password = newData[1];
				System.out.println("User Name is" + userName);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
