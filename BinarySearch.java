import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter total no. of element =");
        int n=sc.nextInt();
        System.out.print("enter each element in sorted form =");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
         }
        System.out.print("enter element you wanna search =");
        int k=sc.nextInt();
        int start=0;
        int end=n-1;
        
        while(start<=end){
            int mid=(start+end)/2;
            if(a[mid]==k){
                System.out.print("element is found in the list at position "+(mid+1));
                break;
            }
            if(a[mid]<k){
                start=mid+1;
                end=n-1;
            }
            if(a[mid]>k){
                end=mid-1;
                start=0;
            }
             }
           if (start>end){
           System.out.println("Element is not found in the list");
           }
   
            
    }
    
}
