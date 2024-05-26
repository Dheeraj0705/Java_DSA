import java.util.Scanner;
public class PanCardCheck {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Checking whether the given data is PanCard No. or Not .");
        System.out.print("Enter PanCard Number = ");
        String a=sc.next();
        int count=0;
        for(int i=0;i<a.length();i++){
        if((i<=4 || i==9)  && Character.isUpperCase(a.charAt(i))){
          count++;
         }
         if(i>4 && i<9 && Character.isDigit(a.charAt(i))){
        count++;
            }
       }
       if(count==10){
        System.out.println("Valid number");
       }
       else{
        System.out.println("Not Valid");
       }
 }
}
