import java.util.Scanner ;
public class Calculator {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Calculator using switch case ");
        System.out.print("Enter the value of a and b =");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c;
        System.out.println("Case 1=Addition  , Case 2= Subtraction ,Case 3=Multiplication , Case 4=Division , Case 5 or more=Default");
        System.out.print("Enter your choice=");
        int n=sc.nextInt();
        switch(n){
            case 1:c=a+b;
            System.out.println("Addition ="+c);
            break;
            case 2:c=a-b;
            System.out.println("Substraction ="+c);
            break;
            case 3:c=a*b;
            System.out.println("Multiplication ="+c);
            break;
            case 4:c=a/b;
            System.out.println(" Division ="+c);
            break;
            default:System.out.println("press no. between 1 to 4 only ");

        }

    }
    
}
