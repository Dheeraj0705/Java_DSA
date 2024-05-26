
import java.util.Scanner;
public class AdvancedPattern {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter element =");
        int n=sc.nextInt();
        int count=1;
        int startrow=1;
        int endrow=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    if(i==1){
                    System.out.print(count+" ");
                    count++;
                    }
                  /*  if(j==n)
                    System.out.print(count+" ");
                    count++;
                    if(i==n)
                    System.out.print((count+n-2)+" ");
                    count--;
                    if(j==1)
                    System.out.print((count+n-2)+" ");
                    count--;
                }*/
                else
            System.out.print("  ");
            }
            System.out.println();
        }
       
    }
    
    }
}
