class Employeee {
    private String name;
    private int id;
    private double salary;

    public void setName(String name) { this.name = name; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public int getId() { return id; }

    public void updateSalary(double amount) {
        if (salary + amount >= 0) salary += amount;
    }

    public double getSalary() { return salary; }

    public static void main(String[] args) {
        Employeee e = new Employeee();
        e.setName("Bob");
        e.setId(102);
        e.updateSalary(3000);
        System.out.println("Salary: " + e.getSalary());
    }
}
