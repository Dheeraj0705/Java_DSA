import java.util.Scanner;
public class Pattern1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("enter the value n= ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
                }
            for(int star=1;star<=i;star++){
            System.out.print("* ");
            }
            System.out.println();
        }
        
        
    }
}