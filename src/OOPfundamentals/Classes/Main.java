package OOPfundamentals.Classes;

public class Main {
    public static void main(String[] args) {
        //instantiente an object
        Class1 c = new Class1(); //the parenthesis is the default constructor
        c.printHi();

        // you can make multiple objects from the same class
        Class1 b = new Class1();
        System.out.print(b.x);

        Class2 a = new Class2();
        System.out.println(a.y);

    }
}
