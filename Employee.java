class Employee {
    private String name, jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void updateSalary(double amount) {
        salary += amount;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Alice", "Manager", 50000);
        emp.updateSalary(5000); // Raise
        emp.printInfo();
    }
}
