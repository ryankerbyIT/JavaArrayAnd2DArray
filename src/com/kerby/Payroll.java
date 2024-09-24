package com.kerby;
//Class Payroll
//1. Declare four arrays: employeeId, hours, payRate, and wages
// a. employeeId is initialized with the given employee IDs
// b. hours, payRate, and wages arrays are initialized with default values (0)
//2. Method setHours: 
// a. Input validation for hours: hours cannot be negative
// b. Set hours for the employee at the given index
//3. Method setPayRate:
// a. Input validation for pay rate: rate must be at least $6.00
// b. Set pay rate for the employee at the given index
//4. Method calculateGrossWages:
// a. Multiply hours by pay rate to calculate gross wages for the employee
//5. Method getEmployeeId:
// a. Return the employee's ID for the given index
//6. Method getWages:
// a. Return the employee's gross wages for the given index
//7. Method displayPayrollData:
// a. Loop through all employees and display their ID, hours worked, pay rate, and gross wages

public class Payroll {

    // Array to store employee IDs (7 employees)
    private int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
    
    // Array to store hours worked by each employee (7 elements)
    private int[] hours = new int[7];
    
    // Array to store pay rate for each employee (7 elements)
    private double[] payRate = new double[7];
    
    // Array to store gross wages for each employee (7 elements)
    private double[] wages = new double[7];

    // Constructor (optional - you can initialize arrays above)
    public Payroll() {
        // No specific initialization needed
    }

    // Method to set hours worked for a specific employee (with input validation)
    public void setHours(int employeeIndex, int hoursWorked) {
        if (hoursWorked >= 0) {
            hours[employeeIndex] = hoursWorked;
        } else {
            System.out.println("Invalid input: Hours worked cannot be negative.");
        }
    }

    // Method to set pay rate for a specific employee (with input validation)
    public void setPayRate(int employeeIndex, double rate) {
        if (rate >= 6.00) {
            payRate[employeeIndex] = rate;
        } else {
            System.out.println("Invalid input: Pay rate must be at least $6.00.");
        }
    }

    // Method to calculate gross wages for a specific employee
    public void calculateGrossWages(int employeeIndex) {
        wages[employeeIndex] = hours[employeeIndex] * payRate[employeeIndex];
    }

    // Method to get an employee's ID
    public int getEmployeeId(int employeeIndex) {
        return employeeId[employeeIndex];
    }

    // Method to get an employee's gross wages
    public double getWages(int employeeIndex) {
        return wages[employeeIndex];
    }

    // Method to display all employees' data
    public void displayPayrollData() {
        System.out.println("Employee ID\tHours Worked\tPay Rate\tGross Wages");
        for (int i = 0; i < employeeId.length; i++) {
            System.out.printf("%d\t\t%d\t\t%.2f\t\t%.2f\n", employeeId[i], hours[i], payRate[i], wages[i]);
        }
    }
}
//Explanation:

//- The employeeId array is pre-initialized with the given employee IDs.
//- The setHours method allows the user to input the hours worked for each employee, with validation to ensure 
//that the hours worked cannot be negative.
//- The setPayRate method allows the user to input the pay rate for each employee, with validation to ensure
//the rate is not below $6.00.
//- The calculateGrossWages method multiplies the hours worked by the pay rate to calculate the gross wages.
//- The getEmployeeId method returns the employee ID for the specified index.
//- The getWages method returns the calculated gross wages for the specified employee.
//- The displayPayrollData method prints the employee data (ID, hours, pay rate, gross wages) in a table format.

