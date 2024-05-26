import java.util.Scanner;
public class StringPalindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any  String =");
        String name=sc.nextLine();
        int n=name.length() ;
        boolean Palindrome=false;
        for(int i=0;i<n/2;i++){ 
            if(name.charAt(i)!=name.charAt(n-1-i)){
               System.out.println("Given string is not palindrome .");
               Palindrome=false;
               break;
            }
            else{
                System.out.println("Gievn string is Palindrome");
                Palindrome=true;
                break;
            }
        }
    }
    
}
