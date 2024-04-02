// git init


/* 
 * this
 * is
 * a 
 * multiline
 * comment
*/

/**
 * this program is for demonstration of basic java
 * OOP principle
 * @author Marc Yim
 */
public class Main{
    public static void main(String[] args) {
        Plant plant1 = new Plant();
        plant1.numberOfLeaves = 10;
        plant1.numberOfStem = 2;
        System.out.println("number of leaves:"+plant1.numberOfLeaves);
        System.out.println("number of stem:"+plant1.numberOfStem);

        plant1.addNumberOfLeaves();
        System.out.println("number of leaves:"+plant1.numberOfLeaves);
    }

}

/**
 * Plant class has numberOfLeaves and numberOfStem
 * also method addNumberOfLeaves is use to modify numberOfLeaves
 */
class Plant{
    int numberOfLeaves;
    int numberOfStem;
    /** {@link #addNumberOfLeaves()}addNumberOfLeaves - to modify numberOfLeaves 
     * @param 
     * unknown
     * 
    */
    public void addNumberOfLeaves(){
        numberOfLeaves++;

    }
}