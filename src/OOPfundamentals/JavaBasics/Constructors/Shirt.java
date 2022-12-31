package OOPfundamentals.JavaBasics.Constructors;

public class Shirt {
    // properties of a shirt - size , color, material
    //to turn shirt into an object in the computer we need to add some properties

    public static String color;
    public static char size;

//    Shirt(){
//        System.out.println("inside constructor!");
//
//    }

    Shirt(){}


    Shirt(String color, char size){
        //set
        this.color=color;
        this.size=size;

    }



    public static void putOn(){
        System.out.println("Shirt is on!");

    }

    public static void takeOff(){
        System.out.print("Shirt is off");
    }

    public static void setColor(String newColor){
        System.out.println("shirt color: "
                + newColor);

        color = newColor;
    }

    public static void setSize(char newSize){
        System.out.println("shirt size: "
                + newSize);

        size = newSize;
    }



}
