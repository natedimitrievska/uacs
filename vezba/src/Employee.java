import com.google.gson.Gson;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        // Create Employee objects
        Employee employee1 = new Employee("Kirili Manasiev", 35000);
        Employee employee2 = new Employee("Ivo Peshkov", 68000);
        Employee employee3 = new Employee("Viktor Sarakinov", 74000);
        Employee employee4 = new Employee("Jerzi Terziovski", 61000);
        Employee employee5 = new Employee("Veton Jordanova", 78000);
        Employee employee6 = new Employee("Boban Mangovski", 81000);
    }
