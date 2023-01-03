package OOPfundamentals.polymorphism;

//class is an outline for an object
class Bird{
    public void sing(){
        System.out.println("chirp chirp chirp");
    }

}

// inherite - extends Bird which means all bird calls methods/variables will transfer to child class(robin).
class Robin extends Bird{
    // not all birds sing the same. so we can override the parent method
    public void sing(){
        System.out.println("Swish swish swish");
    }
}

class Pelican extends Bird{

    public void sing(){
        System.out.println("kwaah kwaah kwaa");
    }
}

/**
 * polymorphism mean many forms -
 * Static or compile time - allows you to implement multiple methods within the same class that use the same name. But java
 * uses a different set of parameters (overloading)
 * different numbers of parameters, different types string/long,
 *
 *
 */
public class Polymorphism {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.sing();
        Robin a = new Robin();
        a.sing();
        Pelican c = new Pelican();
        c.sing();

    }
}
