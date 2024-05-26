import java.util.Scanner;
public class StocksArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Calculating the maximum profit by analysing the stock market when we buy or sell the shares ");
        System.out.print("Enter the size of array =");
        int n=sc.nextInt();
        System.out.print("Enter each element in the array =");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int min_position=0;
        int buy=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            //buy=Math.min(buy,i);
            if(buy>a[i]){
                buy=a[i];
                min_position=i;
                 }
            }
             System.out.println("Day on which it sholud be buy is ="+ min_position);
          int sum=0;
        int  max_position=0;
        int sell=Integer.MIN_VALUE;
       for(int i= min_position;i<n;i++){
        if(sell<a[i]){
            sell=a[i];
            max_position=i;
     }
    }
         System.out.println("Day on which share is to be sold ="+ max_position);
         for(int i=max_position;i>min_position;i--){
            sum+=a[i]-a[i-1];
        }
        System.out.println("Total profit earned = "+sum);
    }
    
}
