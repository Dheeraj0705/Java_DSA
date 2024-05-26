import java.util.*;
public class StringBuilder {
    public static void main(String[] args){
        
        System.out.println("Concept of StringBuilder ");
        StringBuilder r= new StringBuilder("");
        for(char i='a';i<='z';i++){
            r.append(i+" ");
        }   
        System.out.print(r);
     }
    
}
