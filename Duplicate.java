import java.util.Scanner;
public class Duplicate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter total length of digit =");
        int n=sc.nextInt();
        System.out.print("enter any random digit =");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
          
        // int count[]=new int[]
    for(int i=0;i<n;i++){
       if(a[i]^a[i+1]){
                System.out.print(a[i]+" ");
            }
        
        
     }
    
    }
}
