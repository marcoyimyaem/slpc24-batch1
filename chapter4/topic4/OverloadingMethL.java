package chapter4.topic4;

public class OverloadingMethL {
    public void fly(int numMiles) {
        System.out.println("int");
     }
     void fly(Integer s){
        System.out.println("Integer");
    }
    public void fly(short numFeet) {
        System.out.println("short");
     }
    public boolean fly() { return false; }
    void fly(int numMiles, short numFeet) {
        System.out.println("int,short");
     }
    public void fly(short numFeet, int numMiles) throws Exception { }    
    public void fly(String s) {
        System.out.println("string ");
        }
    public void fly(Object o) {
        System.out.println("object ");
        }
    public static String glide(String s) {
            return "1";
            }
    public static String glide(String... s) {
            return "2";
            }
    public static String glide(Object o) {
            return "3";
            }
    public static String glide(String s, String t) {
            return "4";
            }
    public static void main(String[] args) {
        OverloadingMethL olm = new OverloadingMethL();
        System.out.println(olm.fly());
        olm.fly(3);
        olm.fly((short)3);
        olm.fly(new Integer(3));
        olm.fly("test");
        olm.fly(5.6);
        System.out.print(glide("a"));
        System.out.print(glide("a", "b"));
        System.out.print(glide("a", "b", "c"));
        
    }
}

