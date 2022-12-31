package OOPfundamentals.Inheritance;

public class InheritanceExample {
    /**
     *Mouse 1-3 all inherit from Mouse (base class/parent class/super class - an existing class from which the other classes are
     *  determined and properties are inherited).
     * inheritance allows developers to make a generic object and then create a bunch of different variations from it.
     *
     * using methods and properties from a generic class and making different versions of it
     *
     **/

    public static void main(String[] args) {
        Mouse1 m1 = new Mouse1();
        m1.leftClick();
        m1.rightClick();
        m1.scrollDown();
        m1.scrollUp();

        Mouse2 m2 = new Mouse2();
        m2.leftClick();
        m2.rightClick();
        m2.scrollDown();
        m2.scrollUp();
        m2.connect();







    }
}
