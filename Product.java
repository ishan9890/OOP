class Product {
    private String name;
    private int productID;
    private double price;
    private int stock;

    public void setName(String name) { this.name = name; }
    public void setProductID(int id) { this.productID = id; }
    public void setPrice(double price) {
        if (price >= 0) this.price = price;
    }

    public String getName() { return name; }
    public int getProductID() { return productID; }
    public double getPrice() { return price; }

    public void purchase(int quantity) {
        if (stock >= quantity) stock -= quantity;
    }

    public void restock(int quantity) {
        stock += quantity;
    }

    public int getStock() { return stock; }

    public static void main(String[] args) {
        Product p = new Product();
        p.setName("Laptop");
        p.setProductID(101);
        p.setPrice(75000);
        p.restock(50);
        p.purchase(5);

        System.out.println(p.getName() + " (ID: " + p.getProductID() + ") - Price: " + p.getPrice() + " | Stock: " + p.getStock());
    }
}
