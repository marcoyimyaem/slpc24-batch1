package forimport;

import chapter4.topic1.AccessModifL;

public class AnotherPackageSample extends AccessModifL {
    public static void main(String[] args) {
        AnotherPackageSample pagong = new AnotherPackageSample();
        AccessModifL bagon = new AccessModifL();
        bagon.method1();
        pagong.method1();
        pagong.method3();
//        pagong.method4();
    }

}
