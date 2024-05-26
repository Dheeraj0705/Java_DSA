import java.util.Scanner;
public class BitManipulationExercise {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("clearing last i'th bit of any number.");
        System.out.print("Enter any number=");
        int n=sc.nextInt();
        System.out.print("Enter the last i'th position from where you wanna change the bit .=");
        int i=sc.nextInt();
        int bitmask=((~0)<<i);
        System.out.println("Updated number after changing the last i'th bit of number ="+(n & bitmask));
    }
    
}
