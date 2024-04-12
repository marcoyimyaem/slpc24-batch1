package chapter2.l2;

public class ConditionalFlow {
    public static void main(String[] args) {
        int timeofday = 11;
        if(timeofday<12)
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
        switch (dayOfWeek){
            
            case 1: System.out.println("monday"); break;
            case 2: System.out.println("tuesday"); break;
            default: System.out.println("invalid day number"); break;
            case 3: System.out.println("WEDNESday"); break;
            case 4: System.out.println("thursday"); break;
            case 5: System.out.println("friday");  break;
            
        }
        // dayOfWeek = (timeofday<24)?((true)?1:0):((false)?3:2);
        int p = 0;
        while (p<10) 
            System.out.println("P="+ p++);          
        do
          System.out.println("do loop P="+ p--);
        while(p>0);
    }
}
