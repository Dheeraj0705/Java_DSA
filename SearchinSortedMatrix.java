import java.util.Scanner;
public class SearchinSortedMatrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of matrix (i,j) =");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];
        System.out.println("Enter each element in sorted form from both row-wise and col-wise :-");
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
        System.out.print("Enter the element which you wanna search =");
        int key=sc.nextInt();
        int i=0;
        int j=m-1;
        boolean found=false;
        while(i<n && j>=0){
                if(key==matrix[i][j]){
                    System.out.println("key element "+key+" is found at  "+"("+i+","+j+")"+" position.");
                    found=true;
                    break;
                    }
                else if(key>matrix[i][j]){
                   i++ ;
                }
                  else {
                  j--;
                  }
                  
             }
             if(!found){
                System.out.println("key element "+key+" is  not found in the list.");
                }
             }
        }
        
        
