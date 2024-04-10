// git init


/* 
 * this
 * is
 * a 
 * multiline
 * comment
*/

import java.util.Random;
// import forimport.PackageSample;
// import forimport.PackageSample2;
// import forimport.AnotherPackageSample;

import forimport.*;

/**
 * this program is for demonstration of basic java
 * OOP principle
 * @author Marc Yim
 */
public class Main{
    static int edad = 3;
    Main(){
        System.out.println("Main constructor is called");
    }
    {System.out.println("this is instance ini block 1"); }
    public static void main(String[] dfgdfgdfg) {
        Main m1 = new Main();
        Plant plant1 = new Plant();
        // plant1.numberOfLeaves = 10;
        // plant1.numberOfStem = 2;
        System.out.println("number of leaves:"+plant1.numberOfLeaves);
        System.out.println("number of stem:"+plant1.numberOfStem);
        
        plant1.addNumberOfLeaves();
        System.out.println("number of leaves:"+plant1.numberOfLeaves);
        // System.out.println("Hello " +dfgdfgdfg[1] + ", Welcome to Java Class");
        System.out.println("Hello " + ", Welcome to Java Class");
        Random r = new Random();
        System.out.println(r.nextInt(10));
        PackageSample ps1 = new PackageSample();
        PackageSample2 ps2 = new PackageSample2();
        { System.out.println("ini block inside the method");}
        System.out.println(ps1.msg);
        Plant p2Plant = new Plant();
        // Plant p3Plant = new Plant(300,50);
        Name n1 = new Name();
        Name n2 = new Name();
        Name n3 = null;
        n1 = null;
        n1.last = "Lopez";
        // n1.full = n1.first+n1.last;
        System.out.println(n1.full); // show fullname?
        System.err.println(n1.last);
        System.err.println(n2.last);
        System.out.println("Class var: "+(19+getEdad()));
        System.gc();
        System.out.println("garbage collected");
        int xx = 1;
    }
    void callMe(){
        Name n4 = new Name();
        System.out.println("Call me"+edad);
    }
    
    static int getEdad(){
        return edad;
    }
    {System.out.println("this is instance ini block 2"); }
    {callMe();}
}

/**
 * Plant class has numberOfLeaves and numberOfStem
 * also method addNumberOfLeaves is use to modify numberOfLeaves
 */
class Plant{
   public Plant(){
        System.out.println("a new plant has been created");
    }
     void Plant(){
        System.out.println("a new plant has been called by the method");
     
    }
    int numberOfLeaves;
    int numberOfStem;
    /** {@link #addNumberOfLeaves()}addNumberOfLeaves - to modify numberOfLeaves 
     * @param 
     * 
     * 
    */
    public void addNumberOfLeaves(){
        numberOfLeaves++;

    }
    public static void main(String[] args) {
        System.out.println("Plant class is running");
    }

}

class Name{
     String first = "Marc";
     String last = "Yim";
     String full = first+last;
    
}

