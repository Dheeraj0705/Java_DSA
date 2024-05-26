import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Insertion Sort");
        System.out.print("Enter total no. of element =");
        int n=sc.nextInt();
        System.out.print("Enter each element =");
        int a[]=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<n-1;i++){
                   for(int j=i+1;j<n;j++){
                if(a[j]<a[i]){
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
                }
             }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    } 
}
