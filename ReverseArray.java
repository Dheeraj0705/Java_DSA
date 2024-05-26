import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total size of array =");
        int n=sc.nextInt();
        System.out.print("enter each element of the array=");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int last=n-1;
        int first=0;
        int temp=0;
        System.out.print("Reversed aaray is =");
        while(first<last){
            temp=a[last];
            a[last]=a[first];
            a[first]=temp;
            first++;
            last--;
        }
        for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
        }
    }
    
}
