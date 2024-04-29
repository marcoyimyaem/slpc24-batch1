package chapter4.topic2;

public class VarArgs {
    static String sumOfAllInput(String a,int age,int... z){
        int sum = 0;
        for(int x:z)
            sum+=x;
        return "Hello "+a+",you are now "+age+" years old"+" the sum of all numbers is "+sum;
    }
    static String sumOfAllInput2(String a,int age,int[] z){
        int sum = 0;
        for(int x:z)
            sum+=x;
        return "Hello "+a+",you are now "+age+" years old"+" the sum of all numbers is "+sum;
    }
    static int multdimenVarArgs(int[][] p){
        int sum = 0; //{0,1},{2,4},{6,8,9}
        for(int[] a:p){
            for(int z:a)
                sum+=z;
        }
        return sum;
    }
    public static void main(String... args) {
        System.out.println(sumOfAllInput("Marco",21,100,47,5856,2415,3355,3595));
        System.out.println(sumOfAllInput2("Marco",21, new int[]{12,54,25,224,624,52155,1215,0}));
        System.out.println(multdimenVarArgs(new int[][]{{0,1},{2,4},{6,8,9}}));
    }
}
