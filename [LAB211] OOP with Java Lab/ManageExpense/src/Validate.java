
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author duong
 */
public class Validate {

    static Scanner sc = new Scanner(System.in);

    public static double getAmount(String mess, double min, double max) {
        System.out.println(mess);
        String m = sc.nextLine();
        double choice;
        while (true) {
            try {
                choice = Double.parseDouble(m);
                //check choice in a range
                if (choice < min || choice > max) {
                    throw new InputMismatchException("Not in a range [1- Maxvalue]");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.err.println("Reason:" + e.getMessage());
                System.out.println("\"Enter an integer number in range [1- Maxvalue]:  \"");
                m = sc.nextLine();
            }
        }
        return choice;

    }

    public static int getInt(String mess, int min, int max) {
        System.out.println(mess);
        String m = sc.nextLine();
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(m);
                //check choice in a range
                if (choice < min || choice > max) {
                    throw new InputMismatchException("Not in a range [Minvalue - Maxvalue]");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.err.println("Reason:" + e.getMessage());
                System.out.println("\"Enter an integer number in range [MinValue- Maxvalue]:  \"");
                m = sc.nextLine();
            }
        }
        return choice;

    }

    public static Date getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = null;
        sdf.setLenient(false);
        while (true) {
            try {
                System.out.println("Enter date ");

                // xử lý nhập không quá so với ngày hiện tại
                date = sdf.parse(sc.nextLine());
                Date now = new Date();
                if (date.after(now)) {
                    System.out.println("Ngày bạn nhập lớn hơn ngày hiện tại");
                    continue;
                }
                return date;
            } catch (Exception e) {
                System.out.println("Invalid input please input again");
            }

        }

    }

    public static String getName(String mess, String err, String regex) {
        String name;
        while (true) {
            Pattern p = Pattern.compile(regex);
            System.out.println(mess);
            name = sc.nextLine();
            if (p.matcher(name).find()) {
                break;
            } else {
                System.out.println(err);
            }

        }
        return name;
    }

}
