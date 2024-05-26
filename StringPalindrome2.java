import java.util.Scanner;
public class StringPalindrome2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any String =");
        String name=sc.nextLine();
        int n=name.length();
        String reverse="";
        for(int i=n-1;i>=0;i--){
            reverse +=name.charAt(i);
        }
        /*
         StringBuilder rev=new StringBuilder();
        rev=new StringBuilder(name).reverse();
         */
        System.out.println("Reverse String of given string is ="+reverse);
            if(name.toLowerCase().equals(reverse.toLowerCase())){
                System.out.println("Given string is palindrome.");
               }
               else{
                System.out.println("Given String is not a palindrome.");
               }
        }
    }
