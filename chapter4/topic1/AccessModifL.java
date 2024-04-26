package chapter4.topic1;

public class AccessModifL {
    public void method1(){

    }
    private void method2(){

    }
    protected void method3(){

    }
    void method4(){
        // return;
    }
    int returnIntg(){
        int sum=100;
        sum+=(10000/236);
        // return sum;
        // return 0;
        return (int) (sum*30.0);
    }
    Enemy[] getEnemy(){
        return null;
    }
    String stringSLTCFI(int a){
        String p = null;
        if(a==4)
            p= "";
        else
            p="ok";
        return p;
    }
    // byte qm(){
    //     return 128;
    // }


    public static void main(String[] args) {
        Enemy pagong = new Enemy();
        // pagong.attk();
    }
}

class Enemy{
    private void attk(){

    }
    public void attk2(){
        
    }
    public static void main(String[] args) {
        Enemy pagi = new Enemy();
        pagi.attk();
        AccessModifL a = new AccessModifL();
        // a.method2();
        a.method3();
    }
}
