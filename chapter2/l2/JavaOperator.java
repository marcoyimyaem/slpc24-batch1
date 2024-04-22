package chapter2.l1;

public class JavaOperator {
    public static void main(String[] args) {
        int x = 0;
        int y =3;
        boolean z = false;
        System.out.println(x++); //0
        System.out.println(x--); // 1
        System.out.println(++x); //0 x=1+0
        System.out.println(-y + +3);
    //    System.out.println((++x)*1);
        System.out.println(!z);
        System.out.println(5%3);
        System.out.println(6<<1);
        //0000 0110 6 << 1
        //0000 1100 12
        //0000 8421

        //0000 1100 12 >> 1
        //0000 0110 6
        System.out.println(12>>1);

        System.out.println(1<3);
        System.out.println(1<1);
        System.out.println(1<=1);
        System.out.println(3>1);
        System.out.println(1<1);
        System.out.println(1>=1);
        
        System.out.println(1==x);
        System.out.println(0!=x);
        short a =3;
        short b =10;
        System.out.println(a/b);
        
        
        
    }
}
