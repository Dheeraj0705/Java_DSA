import java.util.Scanner;
import java.util.Arrays;
public class AnagramString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Checking whether two String are anagram or not");
        System.out.print("Enter first string =");
         String str1=sc.nextLine();
         int n=str1.length();
         System.out.print("Enter second string =");
         String str2=sc.nextLine();
         int m=str2.length();
         if(n!=m){
            System.out.println(str1 +" and "+str2+" are not anagram .");
         }
         str1=str1.toLowerCase();
         str2=str2.toLowerCase();
         char[] Arraystr1=str1.toCharArray();
         char[] Arraystr2=str2.toCharArray();
         Arrays.sort(Arraystr1);
         Arrays.sort(Arraystr2);
          boolean check=Arrays.equals(Arraystr1,Arraystr2);
          if(check==true)
          System.out.println("Both String "+str1+" and "+str2+" are anagram .");
          else
          System.out.println("Both Strings are not Anagram.");

    }
    
}
