import java.util.Scanner;
public class SubArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array =");
        int n=sc.nextInt();
        System.out.print("Enter each element ot the array = ");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int count=0;
        int sum=0;
        int maximum=Integer.MIN_VALUE;
        System.out.println("Total sub array of the given array are :-");
        for(int i=0;i<n;i++){
            int start=i;
            for(int j=i;j<n;j++){
                int end=j;
                sum=0;
              for(int k=start;k<=end;k++){
              // System.out.print(a[k]+" ");
              sum+=a[k];
                 }
                 System.out.println("   Sum of each subarray is ="+sum);
                 if(maximum<sum){
                 maximum=sum;
                 }
              System.out.print("  ");
              
              count++;
            }
            System.out.println(" ");
            
        }
       
        System.out.println("Total sub array count is ="+count);
        System.out.println("Maximum Sum of the array  is ="+maximum);
    }
    
}
