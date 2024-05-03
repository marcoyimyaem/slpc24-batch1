package chapter4.topic6;
import java.util.*;
public class LamdasL {
    static void print(List<Animal> animals, CheckTrait checker){
        for(Animal animal:animals){
            if(checker.test(animal))
                System.out.print(animal+" ");
            }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Fish", false, true,1));
        animals.add(new Animal("Kangaroo", true, false,3));
        animals.add(new Animal("Rabbit", true, false,1));
        animals.add(new Animal("Turle", false, true,7));
        animals.add(new Animal("Frog", true, true,2));
        animals.add(new Animal("Kaola", false, false,5));
        
        // System.out.println("Animals that can Hop");
        // print(animals, new CheckIfHopper());
        // System.out.println("Animals that can Swim");
        // print(animals, new checkIfSwimmer());
        System.out.println("Animals that can Hop and swim using lambda");
        print(animals, a->a.canHop());
        System.out.println("Animals older that 2 years old");
        print(animals, a->(a.getAge()>2));
        

    }
    
}
class Animal{
    private String species;
    private boolean canHop;
    private boolean canSwim;
    private int age;
    public Animal(String species, boolean canHop, boolean canSwim,int age) {
        this.species = species;
        this.canHop = canHop;
        this.canSwim = canSwim;
        this.age = age;
    }
    @Override
    public String toString() {
        return species;
    }
    public boolean canHop() {
        return this.canHop;
    }
    public boolean canSwim() {
        return this.canSwim;
    }
    public int getAge() {
        return this.age;
    }

    
}


interface CheckTrait{
    boolean test(Animal a);
}
// class CheckIfHopper implements CheckTrait{
//     @Override
//     public boolean test(Animal a){
//         return a.canHop();
//     }

// }
// class checkIfSwimmer implements CheckTrait{
//     @Override
//     public boolean test(Animal a){
//         return a.canSwim();
//     }
// }