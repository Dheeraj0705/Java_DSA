import java.util.Scanner;
public class DiagonalSumMatrix{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of matrix (i,j) =");
        int n=sc.nextInt();
        // int m=sc.nextInt();
        int matrix[][]=new int[n][n];
        System.out.println("Enter each element in the cell of matrix :-");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Given data in the matrix are :-");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
        int sum1=0;
        int sum2=0;
        
        for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
            if(i==j){
                sum1+=matrix[i][j];
            }
            if((i+j)==n-1){
                sum2+=matrix[i][j];
            }
         }
        }
    
    
        System.out.print("Sum of left diagonal is ="+sum1);
        System.out.println();
        System.out.print("sum of right diagonal is ="+sum2);
        System.out.println();
        if(n%2==0){
        System.out.println("Total sum of the diagonal is ="+(sum1+sum2));
        }
        else{
            System.out.println("Total sum of the diagonal is ="+((sum1+sum2)-matrix[n/2][n/2]));
        }

    }
}
