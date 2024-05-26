import java.util.Scanner;
public class SingledigitSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number =");
        int n=sc.nextInt();
        int sum=0;
        while(n>0 || sum>=9){
            {
            if(n==0){
                n=sum;
                sum=0;
            }
            sum+=n%10;
             n=n/10;
            }
        }
        System.out.println("Required total is = "+sum);  
    }
   
}
