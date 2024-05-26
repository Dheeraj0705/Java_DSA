import java.util.Scanner;
public class ShortestPathinString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("W=West | E=East | N=North | S=South");
        System.out.print("Enter Direction in Capital letter. =");
         String Direction=sc.nextLine();
        int n=Direction.length();
        int x=0;
        int y=0;
        for(int i=0;i<n;i++){
            if(Direction.charAt(i)=='W')
            x++;
            if(Direction.charAt(i)=='E')
            x--;
            if(Direction.charAt(i)=='N')
            y++;
            if(Direction.charAt(i)=='S')
            y--;
         }
         System.out.println("X-axis distance from origin="+x);
         System.out.println("Y-axis distance from origin="+y);
         double shortdistance=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
         System.out.println("Shortest Distance from the origin are ="+shortdistance);

    }
    
}
