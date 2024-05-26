import java.util.Scanner;
public class PairArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n=sc.nextInt();
        System.out.print("Enter each element  of the array =");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Pair of the array are :-");
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.print("(" +a[i] +","+a[j]+")");
                count++;
                
            }
            System.out.println("");
        }
        System.out.print("Total pair of the array are ="+count);
        }
    
}
