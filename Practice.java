import java.util.Scanner;
public class PatternPractice{
    int fact=1;
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any number=");
        int a=sc.nextInt();
        
        int factorial (int a){
            if (a>1){
                fact=fact*a;
                factorial(a-1);
                return fact;
            }
        }


    
}
    
}