import java.util.Scanner;
public class FactorialbyRecursion {
    static double sum=1;
    public static int factorial(int n){
        if (n==1){
            System.out.print(n+" ");
            sum*=n;
            return n;
 }
        else{
            System.out.print(n+"*");
            factorial(n-1);
            sum*=n;
        }
        return n;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of n =");
        int n=sc.nextInt();
        System.out.println("factorial of given number n is =");
        factorial(n);
        System.out.println();
        System.out.println("Total sum of factorial  n is ="+sum);
    }
}
