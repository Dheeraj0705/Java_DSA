import java.util.Scanner;
public class FibbonaccibyRecursion{

    public static int Fibbonacci(int n){
        if(n==0 || n==1){
       // System.out.print(n+" ");
        return n;
        }
        int fibn1=Fibbonacci(n-1);
        System.out.print(fibn1+" ");
        int fibn2=Fibbonacci(n-2);
        System.out.print(fibn2+" ");
        int fib=fibn1+fibn2;
        System.out.print(fib+" ");
        return fib;
     } 
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter value of n =");
        int n=sc.nextInt();
        System.out.println("Fibbonacci series is =");
        System.out.println(Fibbonacci(n));
       
    }
}
