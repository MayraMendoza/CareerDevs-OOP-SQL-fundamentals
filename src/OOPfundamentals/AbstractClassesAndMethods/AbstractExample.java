package OOPfundamentals.AbstractClassesAndMethods;

interface DogInterface{
    //NO IMPLEMENTED METHDS
    // an interface is just a list of methods and variables
    // abstract methods do not specify a body
    // interface assumes all methods are abstract which means not implemented - there is no code inside
    // just a list.
    void bark();
    void poop();
    // we don't have to write
    // public abstract void poop()
    // we can but an interface assumes that all of them will be abstract
    // which means unimplemented here
} 


/**
 * Abstract class is a bunch of variables and methods that can be used to create other classes
 * Abstract class cannot be used like a regular class
 * abstract class can have implemented methods and abstract methods
 */
abstract class Dog{

    public void bark(){
        System.out.println("Bark!");
    }

    // an abstract method is a method that isn't implemented yet
    // an abstract method is abstract, it's an idea
    // it has to have the poop method but it doesn't know what to do so you need to implement it
    // which just means make the method poop and put code in it.
    public abstract void poop();

    // why have abstract methods in the first place? if we can just add it to Chihiahua class without adding it
    // in thr abstract class dog.
    //abstract classes help us organize what a dog should have / what should this class be able to do
    //it's basically saying you have to implement your own poop method.
    //how is this different than an interface ?
    // an interface - is just a list of methods and variables
    //interface assumes all methods are abstract which means not implemented - there is no code inside


}
//Chihuahua class is an extension of dog
class Chihuahua extends Dog{
    // we have to implement the abstract method
    public void poop(){
        System.out.println("Dog Pooped!");
    }

}

/**
 * we implement it and not extend an interface because extending means adding on to previously implemented methods
 *
 */
//class Chihuahua implements DogInterface{
//    // we have to implement the abstract method
//    public void poop(){
//        System.out.println("Dog Pooped!");
//    }
//
//}

public class AbstractExample {
    public static void main(String[] args) {
        Chihuahua d = new Chihuahua();
        d.bark();
        d.poop();

    }
}
