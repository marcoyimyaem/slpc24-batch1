package chapter2.l2;

public class ConditionalFlow {
    static boolean getB(int age){
        return (age>18)?true:false;
    }
    public static void main(String[] args) {
        int timeofday = 11;
IF1:        if(timeofday<12)
            System.out.println("Good morning");
        // System.out.println("Good morning");
       else if(timeofday<18)
            System.out.println("Good Afternoon");
        // System.out.println("Good morning");
        else if(timeofday<20)
            System.out.println("kumain kana ba?");
        
        else
            System.out.println("Good Evening");
        int dayOfWeek = 9;
SWT:        switch (dayOfWeek){
            
            case 1: System.out.println("monday"); break;
            case 2: System.out.println("tuesday"); break;
            default: System.out.println("invalid day number"); break;
            case 3: System.out.println("WEDNESday"); break;
            case 4: System.out.println("thursday"); break;
            case 5: System.out.println("friday");  break;
            
        }
        // dayOfWeek = (timeofday<24)?((true)?1:0):((false)?3:2);
        int p = 0;
WGL:        while (p<10) 
            System.out.println("P="+ p++);          
DASODFA:  do
          System.out.println("do loop P="+ p--);
        while(p>0);
    
    // for(ini;booleanExpression;updateStatement)
    //      sout
    
    // for(; ;) // INFINITE LOOP
    for(int x = 30, y=9;getB(x);System.out.println("updateStatement"))
        System.out.println("value of x is = "+ x--);
    // for(;true;)
    //     System.out.println();
    // for-each
    // for(datatype instance: collection)
        // sout
    String[] colors = {"red","blue","green","black","pink"};
    int[] stls = {2,6,8,1,9,43,13};
    String players="game";
    for(String color: colors)
        System.out.println(color);
    
    for(int stl: stls)
        System.out.println(stl);
    
OUTERLOOP:    for(int x=1;x<=10;x++){
INNERLOOP:        for(int y=1;y<=10;y++){
            System.out.print("\t"+ (x*y));
            if(y==7){
                break INNERLOOP;
            }
            if(x==8){
                continue OUTERLOOP;
            }
            // System.out.print("*");
        }
        System.out.println();
    }
}
}
