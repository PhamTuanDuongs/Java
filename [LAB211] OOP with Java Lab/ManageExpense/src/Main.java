
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duong
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        View v = new View();
        Controller nc = new Controller();

        Scanner sc = new Scanner(System.in);
        int choice;
         do {
            v.menu();
            choice = Validate.getInt("\"Enter an integer number in range[1-4]: \"", 1, 4);
            switch (choice) {
                case 1:
                    v.addExpense();
                    break;
                case 2:
                    v.display();
                    break;
                case 3:
                    v.delete();
                    break;
                case 4:
                    System.out.println("Exist");
                    break;

            }

        } while (choice < 4);

    }
    }
    
 
