
import java.util.Scanner;

public class View {

    Controller ctr = new Controller();
    
    static Scanner sc = new Scanner(System.in);

    public void menu() {
        System.out.println("=====Task Program=====");
        System.out.println("1.Add Task");
        System.out.println("2.Delete Task");
        System.out.println("3.Display");
        System.out.println("4.Exist");
    }
    
    

    public void add() {
        int taskType = Validate.getInt("Enter the task Type", 1, 4);
        String name = Validate.getName("Enter name: ", "Not format", "^[a-zA-Z ]+$");
        String date = Validate.getDate();
        double from = 0;
        double to = 0;
        while (true) {
            from = Validate.getDouble("Enter From: in a range[8.0 - 17.0]", 8.0, 17.0);
            to = Validate.getDouble("Enter to: in a range [to > from - 17.5 ", 8.0, 17.5);
            if (from >= to) {
                System.out.println("Please input again: ");
                continue;
            } else {
                break;
            }
        }

        String assignee = Validate.getName("Enter assignee ", "Not format ", "^[a-zA-Z ]+$");
        String review = Validate.getName("Enter review", "Not format", "^[a-zA-Z ]+$");
        ctr.add(name, taskType, from, to, date, assignee, review);
        System.out.println("Add a new task successfully");
    }

    public void delete() {
        int n = Validate.getInt("Enter id ", 1, Integer.MAX_VALUE);
        ctr.delete(n);

    }

    public void display() {

        ctr.display();
    }

}
