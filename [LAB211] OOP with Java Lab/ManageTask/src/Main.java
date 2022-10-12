
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        View v = new View();
        Scanner sc = new Scanner(System.in);
        Controller c = new Controller();
        int choice;

        do {
            v.menu();
            choice = Validate.getInt("\"Enter an integer number in range[1-4]: \"", 1, 4);
            switch (choice) {
                case 1:
                    v.add();
                    break;
                case 2:
                    v.delete();
                    break;
                case 3:
                    v.display();
                    break;
                case 4:
                    System.out.println("Exist");
                    break;
                    

            }

        } while (choice < 4);

    }

}
