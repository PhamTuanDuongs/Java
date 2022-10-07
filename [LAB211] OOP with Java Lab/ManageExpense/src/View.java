
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
public class View {

    Controller c = new Controller();
    List<Expense> list = new ArrayList<>();

    public View() {
        list.add(new Expense(1, "10-Apr-2009", 1000, "Tution fee"));
    }

    public void menu() {
        System.out.println("1.Add an expense");
        System.out.println("2.Display expense");
        System.out.println("3.Remove an expense");
        System.out.println("4.Exist");
    }
//     id, date, quantity, content

    public void addExpense() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        Date date = Validate.getDate();
        String dates = sdf.format(date);
        double quantity = Validate.getAmount("Enter the quantity ",Double.MIN_VALUE , Double.MAX_VALUE);
        String content = Validate.getName("Enter the the content", "Not format", "^[a-zA-Z ]+$");
        try {
            c.addExpense(list, dates, quantity, content);
        } catch (Exception e) {
        }

    }

    public void delete() {
 

    }

    public void display() {

        c.display(list);
    }
}
