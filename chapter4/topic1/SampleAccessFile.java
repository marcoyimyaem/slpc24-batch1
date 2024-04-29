package chapter4.topic1;
import static chapter4.topic3.StaticMethVar.count;
public class SampleAccessFile {
    public static void main(String[] args) {
        AccessModifL pagong = new AccessModifL();
        pagong.method3();
        pagong.method4();
        int x = count;
        count++;
        
    }
}
