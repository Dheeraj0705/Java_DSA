import java.util.Scanner;
public class BitOperation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Performing various Bit-Operation.");
        System.out.println("Getting i'th bit of any number .");
        System.out.print("Enter any number 'n' =");
        int n=sc.nextInt();
        System.out.print("Enter the position of i =");
        int i=sc.nextInt();
        int bitmask=1<<i;
        if((n & bitmask)==0)
        System.out.println("i'th position bit of the given number is 0.");
         else
         System.out.println("i'th position bit of the given number is 1.");

        System.out.println("Setting i'th bit of any number as '1' .");
        System.out.print("Enter any number 'k' =");
        int k=sc.nextInt();
        System.out.print("Enter the position of s =");
        int s=sc.nextInt();
        System.out.println("updated new number after setting i'th position="+(n|bitmask));

        System.out.println("Clear i'th bit of any number to '0' .");
        System.out.print("Enter any number 'b' =");
        int b=sc.nextInt();
        System.out.print("Enter the position of c =");
        int c=sc.nextInt();
        System.out.println("updated new number after setting i'th position="+(n&~(bitmask)));


          



    }
    
}
