package chapter5.topic1;
import java.util.Objects;

public class InheritanceL {
    public static void main(String[] args) {
        Aspi dog1 = new Aspi(2, "Bogat", 8, 4, 13, "Baseco st.");
        dog1.aa();
        dog1.aa2();

        
    }
}

// final class Animal - can not extend
class Animal{
    private int age;
    private String name;
    public int eyes=2;
    public Animal(int age, String name) {
        this(name, age);
        
    }
    Animal(String name,int age){
        this.age = age;
        this.name = name;
    }
    
}

class Mammal extends Animal{

    public Mammal(int age, String name,int numberOfNips) {
        super(age, name);
        this.numberOfNips = numberOfNips;
    }
    private int numberOfNips;
}

class Canine extends Mammal{

    public Canine(int age, String name,int numberOfNips,int numOfTeeth, int weight) {
        super(age,name,numberOfNips);
        this.numOfTeeth = numOfTeeth;
        this.weight = weight;
    }
    private int numOfTeeth;
    private int weight;
    public String eyes = "";
    void aa(){
        System.out.println("aa from canine");
    }
    static void aaa(){
        System.out.println("static method from canine");
    }
}
class Aspi extends Canine{
    String address;
    public Aspi(int age, String name,int numberOfNips,int numOfTeeth, int weight,String address) {
        // System.out.println("asasd");
        super(age,name,numberOfNips,numOfTeeth,weight);
        this.address = address;
    }
    
    void aa(){
        String x = super.eyes;
    }
    void aa2(){
        super.aa();
    }
    static void aaa(){
        System.out.println("aaa from Aspi");
    }
    Canine bbb(){
        return new Aspi(0, eyes, 0, 0, 0, address);

    }
   
}