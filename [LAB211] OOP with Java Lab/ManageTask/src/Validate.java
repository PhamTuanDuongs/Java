
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {

    static Scanner sc = new Scanner(System.in);

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

    public static int getInt(String mess, int min, int max) {
        System.out.println(mess);
        String m = sc.nextLine();
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(m);
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

    public static String taskType(int taskTypeId) {
        String res;
        switch (taskTypeId) {
            case 1:
                res = "code";
                break;
            case 2:
                res = "Test";
                break;
            case 3:
                res = "Design";
                break;
            case 4:
                res = "Review";
                break;
            default:
                res = "";
        }

        return res;
    }

    public static String getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        while (true) {
            try {
                System.out.println("Enter date ");
                sdf.setLenient(false);
                Date date = sdf.parse(sc.nextLine());
                return sdf.format(date);
            } catch (Exception e) {
                System.out.println("Invalid input please input again");
            }

        }

    }

    public static double getDouble(String mess, double min, double max) {
        System.out.println(mess);
        String m = sc.nextLine();
        double n;
        while (true) {
            if (m.isEmpty()) {
                System.out.println("Input could not be empty!");
            } else {
                try {

                    n = Double.parseDouble(m);
                    if (n < min || n > max) {
                        throw new InputMismatchException("Not in a range [8-17.5]");
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    System.err.println("Reason:" + e.getMessage());
                    System.out.println("\"Enter an integer number in range[1-4]:  \"");
                    m = sc.nextLine();

                }
            }
        }
        return n;

    }

//    public static int getint(String mess) {
//        System.out.println(mess);
//        String m = sc.nextLine();
//        int n;
//        while (true) {
//            try {
//                n = Integer.parseInt(m);
//                break;
//            } catch (Exception e) {
//                System.err.println("Reason:" + e.getMessage());
//                 m = sc.nextLine();
//            }
//        }
//        return n;
//    }

}
