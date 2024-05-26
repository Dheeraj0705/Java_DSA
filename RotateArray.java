import java.util.Scanner;
public class RotateArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array =");
        int n=sc.nextInt();
        System.out.print("Enter each element of the array =");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter the value of k by which you wanna rotate the array =");
        int k=sc.nextInt();
         int r[]=new int[k];
         int count=0;
         for(int i=n-1;i>=n-k;i--){
            r[count]=a[i];
            count++;
            }
         for(int i=0;i<k;i++){
         System.out.print(r[i]+" ");
         }
    }
    
}
