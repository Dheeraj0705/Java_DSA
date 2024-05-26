import java.util.Scanner;
public class KadanesArrayAlgorithm {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
   System.out.println("Performing kadane's Algorithm to find out maximum sum of the array while having both -ve and +ve no. in the array.");
System.out.print("Enter the Size of array =");
int n=sc.nextInt();
System.out.print("Enter ecah element in the array=");
int a[]=new int[n];
for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
}
int currSum=0;
int maxm=Integer.MIN_VALUE;
for(int i=0;i<n;i++){
    currSum+=a[i];
    if(currSum<0){
        currSum=0;
    }
    maxm=Math.max(maxm,currSum);
}
System.out.print("Maximum sum of the subArray is ="+maxm);
    }    
}
