
public class Task {

    private int id;
    private String name;
    private int taskType;
    private String date;
    private double from;
    private double to;
    private String Assignee;
    private String review;
    static int idz = 0;

    public Task() {
        idz++;
        this.id = idz;
    }
    // hàm khởi tạo cho 1 task

    public Task(String name, int typeTask, String date, double from, double to, String Assignee, String review) {
        idz++;
        this.id = idz;
        this.name = name;
        this.taskType = typeTask;
        this.date = date;
        this.from = from;
        this.to = to;
        this.Assignee = Assignee;
        this.review = review;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTypeTask() {
        return taskType;
    }

    public void setTypeTask(int typeTask) {
        this.taskType = typeTask;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public String getAssignee() {
        return Assignee;
    }

    public void setAssignee(String Assignee) {
        this.Assignee = Assignee;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Override
    public String toString() {
        double time = to - from;
        String planTime = String.format("%.1f", time);
        String result = String.format("%-7d%-20s%-12s%-15s%-7s%-15s%-15s", id, name, Validate.taskType(taskType), date, planTime, Assignee, review);
        return result;
    }

}
