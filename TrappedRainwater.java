import java.util.Scanner;
public class TrappedRainwater {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        System.out.println("Calculating rainwater trapped by barlevel .");
        System.out.print("Enter the size of barlevel =");
        int n=sc.nextInt();
        System.out.print("Enter the height of each barlevel=");
        int a[]=new int[n];
       for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println();
        System.out.print("enter the width of each bar =");
        int width=sc.nextInt();
        int sum=0;

        //Auxillary array create for leftboundary and right boundary 
        int maxleft[]=new int[n];
        maxleft[0]=a[0];
        int maxright[]=new int[n];
        maxright[n-1]=a[n-1];

        if(n<=2) {
            System.out.println("No water trapped .");
         }
        if(n>2){
            for(int i=1;i<n;i++){
                maxleft[i]=Math.max(maxleft[i-1],a[i]);
            }
                for(int k=n-2;k>=0;k--){
                maxright[k]=Math.max(maxright[k+1],a[k]);
                }
                    for(int j=0;j<n;j++){
                        int waterlevel=Math.min(maxleft[j],maxright[j]);
                        int trapwater=(waterlevel-a[j])*width;
                        sum+=trapwater;
                    }
        }
      System.out.println("Total volume of water trapped is="+sum+" unit");
        
    }
    }
    

