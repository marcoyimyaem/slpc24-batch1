package chapter5.topic1;
import java.util.Objects;
public class InheritanceL {
    public static void main(String[] args) {

        Aspi dog1 = new Aspi(2, "Bogat", 8, 4, 13, "Baseco st.");
    }
}
// final class Animal - can not extend
class Animal{
    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }
    private int age;
    private String name;
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
}
class Aspi extends Canine implements CanSwim{
    String address;
    public Aspi(int age, String name,int numberOfNips,int numOfTeeth, int weight,String address) {
        super(age,name,numberOfNips,numOfTeeth,weight);
        this.address = address;
    }
    @Override
    public int getSPEED() {
        return CanSwim.SPEED+10;
        }
    @Override
    public int getDEPTH() {
        return CanSwim.DEPTH-1;
       }
   
}

// abstract interface CanSwim{
//     public static final int SPEED = 10;
//     public static final int DEPTH = 5;
//     public abstract int getSPEED();
//     public abstract int getDEPTH();
    
// }

interface CanSwim implements CanFly{
    int SPEED = 10;
    public static int DEPTH = 5;
    int getSPEED();
    public abstract int getDEPTH();
    
}

interface CanFly{
    int FLY_SPEED = 10;
    int MAX_ALTITUDE=100;
    int getFLY_SPEED();
}