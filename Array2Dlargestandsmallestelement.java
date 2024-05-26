import java.util.Scanner;
public class Array2Dlargestandsmallestelement {
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
        System.out.println("Entered element by the users are:-- ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(+matrix[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("Finding largest and smallest element in the matrix  .");
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                largest=Math.max(matrix[i][j],largest);
                smallest=Math.min(matrix[i][j],smallest);
            }
        }
        System.out.println("largest element in the matrix is = "+largest);
        System.out.println("smallest element in the matrix is = "+smallest);



    }
    
}
