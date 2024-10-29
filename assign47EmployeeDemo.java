import java.util.Scanner;

class Employee {
    private int emp_id;
    private String emp_name;
    private double basic_salary;
    private double gross_salary;

    // Constructor to initialize employee details
    public Employee(int emp_id, String emp_name, double basic_salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.basic_salary = basic_salary;
        calculateGrossSalary();
    }

    // Method to calculate gross salary
    private void calculateGrossSalary() {
        double hra = basic_salary * 0.10; // House Rent Allowance (10% of basic salary)
        double da = basic_salary * 0.08;  // Dearness Allowance (8% of basic salary)
        double ta = basic_salary * 0.05;  // Travel Allowance (5% of basic salary)
        gross_salary = basic_salary + hra + da + ta;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Basic Salary: " + basic_salary);
        System.out.println("Gross Salary: " + gross_salary);
    }
}

public class assign47EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking employee details from user
        System.out.print("Enter Employee ID: ");
        int emp_id = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        System.out.print("Enter Employee Name: ");
        String emp_name = scanner.nextLine();
        System.out.print("Enter Basic Salary: ");
        double basic_salary = scanner.nextDouble();

        // Creating an Employee object
        Employee employee = new Employee(emp_id, emp_name, basic_salary);
        
        // Displaying employee details
        employee.displayEmployeeDetails();

        scanner.close();
    }
}

