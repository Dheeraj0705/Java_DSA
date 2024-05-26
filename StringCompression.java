import java.util.Scanner;
public class StringCompression {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Performing String compression program.");
        System.out.println("like aabbccccddd is written as a2b2c4d3 .");
        System.out.print("Enter an string =");
        String s=sc.nextLine();
        String newStr="";
        int n=s.length();
       
        for(int i=0;i<n;i++){
            Integer count=1;
                while(i<n-1 && s.charAt(i)==s.charAt(i+1)){
                count++;
                i++;
                }
                    newStr+=s.charAt(i);
                    if(count>1){
                        newStr+=count.toString();
                    }
         }
        System.out.println("String Compression output ="+newStr);
    }
}
