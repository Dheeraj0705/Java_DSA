import java.util.Scanner;
public class StringExercise {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any Sentence =");
        String in=sc.nextLine();
        StringBuilder ou=new StringBuilder();
        int n=in.length();
        char ch=Character.toUpperCase(in.charAt(0));
        ou.append(ch);
    for(int i=1;i<n;i++){
        if(in.charAt(i)==' '  && i<n-1){
            ou.append(in.charAt(i));
            i++;
            ou.append(Character.toUpperCase(in.charAt(i)));
        }
        else{
            ou.append(in.charAt(i));
        }
    }
    System.out.println("Output of given input is="+ou);
}
}