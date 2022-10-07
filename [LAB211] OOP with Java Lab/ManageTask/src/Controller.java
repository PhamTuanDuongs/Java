
import java.util.ArrayList;
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

    List<Task> task = new ArrayList<>();

    public Controller() {
        task.add(new Task("Tester", 3, "04-06-2001", 8, 8.5, "Dev", "Employess"));
    }

    public void add(String name, int typeid, double from, double to, String date, String assignee, String review) {

//        int id = 1;
//
//        if (!task.isEmpty()) {
//            id = task.get(task.size() - 1).getId() + 1;
//        }
        Task t = new Task(name, typeid, date, from, to, assignee, review);
        task.add(t);
    }

    public void display() {
        String result1 = String.format("%-7s%-20s%-12s%-15s%-7s%-15s%-15s", "id", "Name", "taskType", "Date", "Time", "Assignee", "review");
        System.out.println(result1);
        for (Task task1 : task) {
            System.out.println(task1.toString());
        }
    }

    public void delete(int id) {
        boolean check = false;
        for (int i = 0; i < task.size(); i++) {
            if (task.get(i).getId() == id) {
                task.remove(i);
                check = true;
                System.out.println("Delet successfuly");
            }
        }
        if (!check) {
            System.out.println("Delet Fail ");
        }

    }
}
