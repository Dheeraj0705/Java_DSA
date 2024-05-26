import java.util.Scanner;
public class CheckOddorEvenUsingBitOperator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Checking the number whether it is even or odd using Bit-Operator");
        System.out.print("Enter any number =");
        int n=sc.nextInt();
        int lsb=n&1;
        if(lsb==1)
        System.out.println("Given number is odd ");
        else
        System.out.println("Given number is even ");
    }
    
}
