import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter total of element =");
        int n =sc.nextInt();
        int a[]=new int[n];
        System.out.print("enter the element in the array =");
        for(int e=0;e<a.length;e++){
            a[e]=sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                     temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                   }    
                } 
                    }
                     for(int i=0;i<a.length;i++){
                        System.out.println(a[i]);
                     }
                  
                   
                
       

    }
    
}
