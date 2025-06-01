class Book {
    private String title, author;
    private int year;
    private boolean available = true;

    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setYear(int year) { this.year = year; }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }

    public boolean isAvailable() { return available; }

    public void borrow() {
        if (available) available = false;
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.setTitle("Java Basics");
        b.setAuthor("ABC");
        b.setYear(2022);
        b.borrow();
        System.out.println("Book Available: " + b.isAvailable());
    }
}


