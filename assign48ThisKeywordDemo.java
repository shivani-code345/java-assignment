class Employee {
    private int emp_id;
    private String emp_name;
    private double basic_salary;
    public Employee(int emp_id, String emp_name, double basic_salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.basic_salary = basic_salary;
    }
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + this.emp_id);
        System.out.println("Employee Name: " + this.emp_name);
        System.out.println("Basic Salary: " + this.basic_salary);
    }
    public Employee(int emp_id) {
        this(emp_id, "Default Name", 0.0);
    }
    public void updateSalary(double increment) {
        this.basic_salary += increment;
        System.out.println("Salary updated. New Salary: " + this.basic_salary);
    }
}

public class assign48ThisKeywordDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Alice", 50000);
        emp1.displayEmployeeDetails();
        emp1.updateSalary(5000);
        Employee emp2 = new Employee(102);
        emp2.displayEmployeeDetails();
    }
}

