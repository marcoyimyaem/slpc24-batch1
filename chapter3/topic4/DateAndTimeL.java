package chapter3.topic4;
import java.time.*;
import java.util.Scanner;
public class DateAndTimeL {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        LocalDate date1 = LocalDate.of(2077, 2, 24);
        // Scanner inputdate = new Scanner(System.in);
        // Scanner inputdate2 = new Scanner(System.in);
        // System.out.println("enter a date year month day");
        // LocalDate date2 = LocalDate.of(inputdate.nextInt(), inputdate.nextInt(), inputdate.nextInt());
        // System.out.println(date2);
        
        // System.out.println("enter a date (month day year)  ");
        // int m,d,y;
        // m = inputdate2.nextInt();
        // d = inputdate2.nextInt();
        // y = inputdate2.nextInt();
        // LocalDate date3 = LocalDate.of(y,m,d);
        // System.out.println(date3);
        LocalDate date4 = LocalDate.of(2055,Month.APRIL,25);
        LocalTime time1 = LocalTime.of(5,30);
        LocalTime time2 = LocalTime.of(5,30,10);
        LocalTime time3 = LocalTime.of(5,30,20,300);
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);

        LocalDateTime localdt1 = LocalDateTime.of(2000,12,11,4,45);
        LocalDateTime localdt2 = LocalDateTime.of(2000,12,11,4,45,20);
        LocalDateTime localdt3 = LocalDateTime.of(2000,12,11,4,45,20,2000);
        System.out.println(localdt1);
        System.out.println(localdt2);
        System.out.println(localdt3);

        LocalDateTime localdt4 = LocalDateTime.of(date1,time2);
        //LocalDate - plus,minus - Days,Month,Year
        System.out.println(date1.plusDays(100));
        System.out.println(date1);
        //LocalTime - plus,minus - Hours,Minutes,Seconds,Nanos
        System.out.println(time3.plusNanos(500));
        System.out.println(time3);
        //LocalDateTime - plus,minus - Days,Month,Year,Hours,Minutes,Seconds,Nanos
        System.out.println(Month.FEBRUARY.maxLength());
    }
}
