package OOPfundamentals.Encapsulation;

public class Student {

    private String name;
    private int age;

    //Encapsulation methods
    // setting and retrieving the variables
    public void setName(String newName){
        name = newName;
    }

    public String  getName(){
        return name;
    }

    public void setAge(int newAge){
        age = newAge;
    }

    public int getAge(){
        return age;
    }



}
