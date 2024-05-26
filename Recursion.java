import java.util.Scanner;
public class Recursion {
    static int count=0;
   public static int printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            count++;
            return n;
            }
        else{
            printInc(n-1);
        System.out.print(n+" ");
      }
        count=count+1;
        return n;
    }
    public static int printDec(int n){
        if(n==1){
            System.out.print(n+" ");
            count++;
            return n;
            }
        else{
            System.out.print(n+" ");
            printDec(n-1);
     }
        count=count+1;
        return n;
    }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter value of n =");
            int n=sc.nextInt();
            System.out.println("increasing order =");
            printInc(n);
            System.out.println();
            System.out.println("decreasing order =");
            printDec(n);
            System.out.println();
            System.out.println("total count is ="+count);
         }
    
}
