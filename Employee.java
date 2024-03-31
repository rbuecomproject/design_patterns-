// Employee class
class Employee {
    // Member variables
    private String name;
    private int employeeId;
    private double hourlyRate;
    private double hoursWorked;

    // Constructor
    public Employee(String name, int employeeId, double hourlyRate) {
        this.name = name;
        this.employeeId = employeeId;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = 0; // Initially, no hours worked
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }

    // Method to set hours worked
    public void setHoursWorked(double hours) {
        this.hoursWorked = hours;
    }
}
