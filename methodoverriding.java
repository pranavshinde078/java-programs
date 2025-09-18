
class Animal {
    void sound() {
        System.out.println("animal sound");
    }
}


class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("barking");
    }
}


class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("meow");
    }
}


public class Polymorphism {
    public static void main(String[] args) {
       
        Animal myanimal = new Animal(); 
        Animal mydog = new Dog();       
        Animal mycat = new Cat();       

       
        myanimal.sound(); 
        mydog.sound();     
        mycat.sound();     
    }
}
