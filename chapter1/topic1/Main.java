// git init
public class Main{
    public static void main(String[] args) {
        Plant plant1 = new Plant();
        plant1.numberOfLeaves = 10;
        plant1.numberOfStem = 2;
        System.out.println("number of leaves:"+plant1.numberOfLeaves);
        System.out.println("number of stem:"+plant1.numberOfStem);
    }

}

class Plant{
    int numberOfLeaves;
    int numberOfStem;
}