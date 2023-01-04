package OOPfundamentals.Encapsulation;
// Encapsulation - in a little capsule
//encapsulation in java all the setting of variables of a class is inside a method.
// we use getters and setters to implement encapsulation.
//encapsulation makes it simple for a user of an object example we are allowing them not having to deal with
// variables and to set and get through these methods..

public class Main {

    public static void main(String[] args) {
        Student s = new Student();
//        s.name ="Tommy";
//        s.age= 18;
//        System.out.println(s.name);
//        System.out.println(s.age);
        // when create s - s knows everything in the student class
        //the point of encapsulation is to abstract the variables from the user
        // and to make it simple to use the object.
        s.setName("Mayra");
        s.setAge(24);
        System.out.print(s.getName());
        System.out.println(s.getAge());


    }


}
