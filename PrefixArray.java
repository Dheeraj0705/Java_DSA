import java.util.Scanner;
public class PrefixArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);                                                                                    
        System.out.print("Enter size of the array =");
        int n=sc.nextInt();
        System.out.print("Enter each element ot the array = ");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        int maximum=Integer.MIN_VALUE;
        int prefix[]=new int[n];
        prefix[0]=a[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+a[i];
        }
       
        for(int i=0;i<n;i++){
         for(int j=i;j<n;j++){
            sum=i==0?prefix[j]:prefix[j]-prefix[i-1];
                 }
                 System.out.println("Sum of each subarray is ="+sum);
                 if(maximum<sum){
                 maximum=sum;
                 }
              System.out.print("  ");
            
            }    
        
       System.out.println("Maximum Sum of the array  is ="+maximum);
}   
}
