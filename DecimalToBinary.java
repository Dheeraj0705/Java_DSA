import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args){
        int bin=0;
        int rem=0;
        int quot=0;
        int power=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a decimal no. =");
        int n=sc.nextInt();
        int deci=n;
        while(deci>0){
            quot=deci/2;
            rem=deci%2;
             bin+=rem*Math.pow(10,power);
             power++;
            deci=quot;
        }
       
        System.out.println();


        System.out.println("Binary of given decimal "+n +" is = "+bin);

       


    }
    
}
