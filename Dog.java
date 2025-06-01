class Dog {
    private String name, breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) { this.name = name; }
    public void setBreed(String breed) { this.breed = breed; }

    public String getName() { return name; }
    public String getBreed() { return breed; }

    public static void main(String[] args) {
        Dog d1 = new Dog("Bruno", "Labrador");
        Dog d2 = new Dog("Lucy", "Beagle");

        d1.setName("Max");
        d2.setBreed("Poodle");

        System.out.println("Dog 1: " + d1.getName() + ", " + d1.getBreed());
        System.out.println("Dog 2: " + d2.getName() + ", " + d2.getBreed());
    }
}
