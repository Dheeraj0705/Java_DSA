import java.util.Scanner;
public class PatternPractice {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number = ");
        int n=sc.nextInt();
            
        for(int i=1;i<=n;i++){
            for(int j=i;j<=(2*i);j++){
                System.out.println("*");
                for(int k=1;k>=(n-2*i);k++){
                    System.out.println(" ");
                }
                  }
            
            System.out.println();
        }

    }
    
}
