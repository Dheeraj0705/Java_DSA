import java.util.Scanner;
public class Factorial {
    public static int fact(int n){
         int f=1;
        for(int i=1;i<=n;i++){
           
             f*=i;
           
        }
         return f;
    }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the value of n =");
            int n=sc.nextInt();
            System.out.print("Enter the value of r =");
            int r=sc.nextInt();
            int a=fact(n);
            System.out.println("Factorial of given number n is = "+a);

             int b=fact(r);
            
            System.out.println("Factorial of given number r is = "+b);


            System.out.println("Calculating Binomial coefficient  n!/r!*(n-r)!");
            
            
            int c=fact(n-r);

            int res=a/(b*c);

            System.out.println("Binomial coefficient of the following is = "+res);

        
    }
    
}
