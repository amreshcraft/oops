// run time , compile time

class Animal {
    public void sound() {
        System.out.println("Hello from Animal");
    }

    public void animalPersonal() {
        System.out.println("animal personal method");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Hello from Cat");
    }

    public void catPersonal() {
        System.out.println("cat personal method");
    }
}

public class Polymorphism1 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.animalPersonal();// only animal class method not child
        a.sound();

        Animal b = new Cat();
        b.animalPersonal();
        b.sound();
        

        Cat c = new Cat();
        c.catPersonal();
        c.animalPersonal();
        c.sound();
    }
}