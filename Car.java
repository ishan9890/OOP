class Car {
    private final String make;
    private final String model;
    private double pricePerDay;
    private boolean available = true;

    public Car(String make, String model, double pricePerDay) {
        this.make = make;
        this.model = model;
        this.pricePerDay = pricePerDay;
    }

    public String getMake() { return make; }
    public String getModel() { return model; }
    public double getPricePerDay() { return pricePerDay; }

    public void setPricePerDay(double pricePerDay) {
        if (pricePerDay >= 0) this.pricePerDay = pricePerDay;
    }

    public boolean isAvailable() { return available; }

    public void rent() { available = false; }
    public void returnCar() { available = true; }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 80);
        car.rent();
        System.out.println("Available: " + car.isAvailable());
        car.returnCar();
        System.out.println("Available: " + car.isAvailable());
    }
}
