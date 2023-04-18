package Models;

import interfaces.Animal;

public class Dog implements Animal {

    public void makeSound(){
        System.out.println("woof");
    }

    public void printInfo(){
        System.out.println("this is a Dog");
    }

}
