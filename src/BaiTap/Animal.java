package src.BaiTap;

abstract class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();

    //phương thức nạp chồng(overload)
    public void eat() {
        System.out.println("Animal is eating");
    }

    public void eat(String food) {
        System.out.println("Animal is eating" + food);

    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

