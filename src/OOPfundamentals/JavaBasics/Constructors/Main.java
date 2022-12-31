package OOPfundamentals.JavaBasics.Constructors;

/**
 * word constructor ~ like construction
 * a constructor makes an object -
 *
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        //instantiate
        // shirt object s = to new shirt
        Shirt s = new Shirt(); // default constructor.
        // default constructor purpose is to initialize the attributes of the object their default values.
        s.setColor("white");
        s.setSize('M');
        s.putOn();

        System.out.println(s.color);
        System.out.println(s.size);

        // why make a custom constructor when there is a default constructor?
        // you may want to create a shirt with certain attributes...
        // instead of making a shirt and then setting the color to white and then the  size to medium
        // you can "I want a shirt that is medium and white" when its initially instantiated.


        //
        Shirt s1 = new Shirt("white", 'M');

    }
}
