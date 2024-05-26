import java.util.Scanner;
public class BitManipulationExercise1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Clearing the range of bit of given number. ");
        System.out.print("Enter any number =");
        int n=sc.nextInt();
        System.out.print("Enter the range(i and j) from which bit changed =");
        int i=sc.nextInt();
        int j=sc.nextInt();
        int b=(1<<i)-1;
        int a=((~0)<<(j+1));
        int bitmask=a|b;
        int result=n&bitmask;
        System.out.println("Updated number after changing ="+result);
        System.out.println("Checking whether the number is power of 2 or not.");
        System.out.print("Enter a number to be check =");
        int x=sc.nextInt();
        int t= (x & (x-1));
        if(t==0)
        System.out.println("Given number is the power of 2.");
        else
        System.out.println("Given number is not power of 2 .");
        System.out.println();
        System.out.println("Counting Sets Bit(1) in a number");
        System.out.print("Enter any number =");
        int c=sc.nextInt();
        int count=0;
        int q=0;
        while(c>0){
            int temp=c&1;
            if(temp!=0){
            count++;
            }
            c=c>>1;
        }
System.out.println("total sets bit(1) in the given number is ="+count);
System.out.println();
System.out.println("Finding power of any number using fast exponentiation .");
System.out.print("Enter number =");
int num=sc.nextInt();
System.out.print("Enter its power= ");
int pow=sc.nextInt();
int solution=1;
while(pow>0){
    if((pow &1)!= 0){
    solution=solution*num;
    }
    num=num*num;
    pow=pow>>1;
}
System.out.println("Answer  is = "+solution);
}
    }
    

