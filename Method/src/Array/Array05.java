package Array;

public class Array05 {

    public static void main(String[] args) {
     int[]result=AA(10,20,30);
        System.out.println("总和"+result[0]);
        System.out.println("平均数"+result[1]);
    }
     public static int[] AA(int a, int b,int c){
        int sum =a+b+c;
        int avg=sum/3;

        /*int []array=new int[2];
        array[0]=sum;
        array[1]=avg;

         */
        int[]array={sum,avg};
        return array;


}
}
