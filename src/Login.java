import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Login {
    int userType=-1;

    // Log user in using either SellerInfo or BuyerInfo
    public int startLogin(String textFile){
        try {
            File myObj = new File("C:\\Users\\jarma\\IdeaProjects\\Design-Patterns-Siri\\src\\" + textFile);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String newData[] = data.split(":");
                String userName = newData[0];
                String password = newData[1];
                System.out.println("User Name is " + userName);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        if (textFile == "SellerInfo.txt") {
            userType = 1;
        } else {
            userType = 0;
        }
        return userType;
    }
}
