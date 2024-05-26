import java.util.Scanner;
public class BinarytoDecimal {
public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
        System.out.print("enter total bit of no. =");
        int m=sc.nextInt();
        System.out.print("Enter binary  number = ");
        int n=sc.nextInt();
        int pw=0;
        int deci=0;
        for(int i=0;i<m;i++){
            int ld=n%10;
            if(ld==1){
                deci+=Math.pow(2,pw);
            }
            n=n/10;
            pw++;
        }
        System.out.println("Decimal of given number is = "+deci);
}
}
         