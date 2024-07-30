package src.BaiTap;

class Cat extends Animal {
    String breed;

    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    //ghi đè phương thức make sound
    public void makeSound() {
        System.out.println("Cat meow meow");
    }

    //phương thức riêng của mèoooo
    public void purr() {
        System.out.println("Cat is purring");

    }

    // Ghi đè phương thức in thông tin
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Breed: " + breed);
    }
}



