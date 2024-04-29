package chapter4.topic3;

public class StaticMethVar {
    public static final int  NUMBER_ONE;
    
    public static int count;
    public int counter;
    static void getCount(){

    }
    void checkcount(){
        System.out.println(count);
    }
    void checkcount2(){
        count++;
    }
    public static void main(String[] args) {
        System.out.println(count);
        count++;
        
        StaticMethVar smv = new StaticMethVar();
        StaticMethVar smv2 = new StaticMethVar();
        smv.checkcount();
        smv.count = 0;
        smv.counter++;
        smv2.counter=10;
        smv2.count = 2;
        smv.checkcount();
        smv2 = null;
        System.out.println(smv.count);
        smv.checkcount2();
        System.out.println(count);
        System.out.println(smv.count);
        
        System.out.println(smv2.count);
        
    }
    static{
        NUMBER_ONE = 1;
    }
}
