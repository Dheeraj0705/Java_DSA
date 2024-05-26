import java.util.Scanner;
public abstract class LinearSearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter total no. of element =");
        int n=sc.nextInt();
        System.out.print("enter each elements= ");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("enter element which you wanna search =");
        int k=sc.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]==k){
                System.out.println(" Element " +k +" found at " +(i+1)+ " position ");
                break ;
            } 
            if(i==n){
                System.out.println("Element is not found in this list");
                }
         
        }
        
    }
    
}
