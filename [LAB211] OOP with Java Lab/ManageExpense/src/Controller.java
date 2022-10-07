
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author duong
 */
public class Controller {

    public Controller() {

    }

    public boolean addExpense(List<Expense> list, String date, double amount, String content) {
        int id = 1;
        if (!list.isEmpty()) {
            id = list.get(list.size() - 1).getId();
        }
        Expense e = new Expense(id, date, 100, "Tution fee");
        list.add(e);
        return true;
    }

    public void delete(List<Expense> list, Expense ex) {
        boolean check = false;

        for (int index = 0; index < list.size(); index++) {
            if (list.get(index) == ex) {
                list.remove(index);
                check = true;
            }
        }

        if (!check) {
            System.out.println("Delete an expense fail");
        } else {
            System.out.println("Delete an expense successful ");
        }

    }

    public void display(List<Expense> list) {
        double total = 0;
        String result1 = String.format("%-7s%-20s%-15s%-15s", "id", "date", "amount", "content");
        System.out.println(result1);
        for (Expense expense : list) {
            total = +expense.getQuantity();
            System.out.println(expense.toString());
        }
        System.out.println("\t\ttotal: " + total);
    }
}
