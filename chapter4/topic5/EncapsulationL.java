package chapter4.topic5;

public class EncapsulationL {
    public static void main(String[] args) {
        Swan motherSwan = new Swan();
        Swan titaSwan = new Swan();
        // motherSwan.numberEggs = -10;
        System.out.println(motherSwan.getNumberEggs());
        motherSwan.setNumberEggs(21);
        System.out.println(motherSwan.getNumberEggs());
        System.out.println(titaSwan.getNumberEggs());
        titaSwan.setNumberEggs(-12);
        System.out.println(titaSwan.getNumberEggs());
        System.out.println(motherSwan);
    }
}
class Swan{

    @Override
    public String toString() {
        return "{" +
            " numberEggs='" + getNumberEggs() + "'" +
            ", numberOfDucklings='" + getNumberOfDucklings() + "'" +
            "}";
    }
    private int numberEggs;
    private int numberOfDucklings;

    public int getNumberOfDucklings() {
        return this.numberOfDucklings;
    }

    public void setNumberOfDucklings(int numberOfDucklings) {
        this.numberOfDucklings = numberOfDucklings;
    }
    public int getNumberEggs() {
        return numberEggs;
    }
    public void setNumberEggs(int x){
        if(x>0)
            this.numberEggs = x;
        else
            System.out.println("invalid number");
    }
}