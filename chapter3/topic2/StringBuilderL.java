package chapter3.topic2;

public class StringBuilderL {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle");
        StringBuilder same = sb.append("+end");
        same.append("+end2");
        System.out.println(sb+"=="+same);
        StringBuilder sb2 = new StringBuilder("start+middle+end+end2");
        System.out.println(sb==same);
        StringBuilder sb3 = new StringBuilder("animals");
        sb3.insert(7, "r");
        System.out.println(sb3.toString());
        sb3.reverse();
        System.out.println(sb3);
    }
    
}
