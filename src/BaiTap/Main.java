package src.BaiTap;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Sâu", 4, "mèo anh lông ngắn");
        cat.printInfo();
        cat.makeSound();
        cat.eat(); // Output: Animal is eating
        cat.eat("Fish");
        cat.purr();
    }
}
