import java.util.Scanner;
public class CountingSort {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter total element =");
        int n=sc.nextInt();
        System.out.print("enter each element =");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
         int largest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            largest=Math.max(largest,a[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<n;i++){
            count[a[i]]++;
             }
             for(int i=0;i<n;i++){
               System.out.println(a[i]+ " frquency occur is " +count[a[i]]);
               
                 }
               System.out.print("Counting sort of given no. is =");  
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                a[j]=i;
                j++;
                count[i]--;
              }

        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
           
        
    }
    
}
