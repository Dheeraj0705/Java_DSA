import java.util.Scanner;
import java.util.Arrays;
public class ConsecutiveArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of Array =");
        int n=sc.nextInt();
        System.out.println("Enter Each element=");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
      //  System.out.println(a);
       /* int count=0;
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            largest=Math.max(largest,a[i]);
        }
        int b[]=new int[largest+1];
        while()*/

    }
    
}
