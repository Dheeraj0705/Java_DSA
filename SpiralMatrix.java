import java.util.Scanner;
public class SpiralMatrix{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of matrix (i,j) =");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];
        System.out.println("Enter each element in the cell of matrix :-");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Given data in the matrix are :-");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
       int startrow=0;
       int startcol=0;
       int endrow=n-1;
       int endcol=m-1;
       while (startrow<=endrow || startcol<=endcol){
        for(int j=startcol;j<=endcol;j++){
            System.out.print(matrix[startrow][j]+" ");
        }
        for(int i=startrow+1;i<=endrow;i++){
            System.out.print(matrix[i][endcol]+" ");
        }
        for(int j=endcol-1;j>=startcol;j--){
            System.out.print(matrix[endrow][j]+" ");
        }
        for(int i=endrow-1;i>=startrow+1;i--){
            System.out.print(matrix[i][startcol]+" ");
        }
        startrow++;
        startcol++;
        endrow--;
        endcol--;
       }
  System.out.println();
    }
}