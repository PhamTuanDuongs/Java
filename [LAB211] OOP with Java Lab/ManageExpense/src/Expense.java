 
public class Expense {

    private int id;
    private String date;
    private double quantity;
    private String content;

    public Expense() {
    }

    public Expense(int id, String date, double quantity, String content) {
        this.id = id;
        this.date = date;
        this.quantity = quantity;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        String result = String.format("%-7d%-20s%-15s%-15s", id, date, quantity, content);
        return result; //To change body of generated methods, choose Tools | Templates.
    }

}
