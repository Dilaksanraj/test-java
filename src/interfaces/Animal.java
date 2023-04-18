package interfaces;

public interface Animal {
    void makeSound();
    default void printInfo(){
        System.out.println("this is an Animal");
    }
}
