import java.util.Scanner;
public class SelectioSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total number of element =");
        int n=sc.nextInt();
        System.out.print("Enter the elements = ");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        
        int temp=0;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[min]>a[j]){
                    min=j;
                }
               
            }
            temp=a[min];
            a[min]=a[i];
            a[i]=temp;
           
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }

    }
    
}
