package CollectionExample.ClassesAbstract;

public class AbstractionExample {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.mySound();
        dog.eat("Dog");
        cat.mySound();
        cat.eat("Cat");
    }
}

abstract class Animal {
    final int legs = 4;  // all variables are by defalut final
    String str;

    public abstract void mySound();
    public void eat(String animal) {

        System.out.println("method inside Abstract class which are not abstract");
        System.out.println(animal + ": I eat flesh");
    }
}

class Dog extends Animal{
    public void mySound(){

        System.out.println(" Abstract Method declared in Dog class : \n  I am a Dog and I have " + legs + " legs and x =" + str);
    }
}

class Cat extends Animal {
    public void mySound() {
        System.out.println(" Abstract Method declared in Cat class : \n  I am a Cat and I have " + legs + " legs");
    }
}
