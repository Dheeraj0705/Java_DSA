import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total number of  line ,n = ");
        int n=sc.nextInt();
        char c='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c);
                c++;
            }
            System.out.println(" ");
        }


    }
    
}
