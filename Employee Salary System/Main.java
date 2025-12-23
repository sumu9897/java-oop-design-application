class Employee {
    private String employeeId;
    private double salary;

    public Employee(String employeeId, double salary) {
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double amount) {
        salary += amount;
    }

    public void deductSalary(double amount) {
        if (salary - amount < 0) {
            System.out.println("Error: Salary cannot be negative");
        } else {
            salary -= amount;
        }
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee("E201", 30000);
        e.increaseSalary(5000);
        e.deductSalary(10000);
        e.displayEmployeeInfo();
    }
}
