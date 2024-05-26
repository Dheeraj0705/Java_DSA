public class ConstructorOverloading {
 public static void main(String[] args){
        ConstructOverloading c1=new ConstructOverloading();
        ConstructOverloading c2=new ConstructOverloading(2102150);
        System.out.println(c2.roll);
        ConstructOverloading c3=new ConstructOverloading("Yellow");
        System.out.println(c3.color);
        ConstructOverloading c4=new ConstructOverloading(c2);
        System.out.println("Copy constructor using roll :"+c4.roll);
    }

     static class ConstructOverloading{
        int roll;
        String color;
        int age;
        
    ConstructOverloading(){
        System.out.println(" Checking constructor overloading program .");
        System.out.println("Without parameter constructor (Non-parameterized)");
    }
    ConstructOverloading(int roll)
    {
        this.roll=roll;
    }
    ConstructOverloading(ConstructOverloading c2){
        this.roll=c2.roll;
          // copy constructor
          

    }

    ConstructOverloading(String Color){
        this.color=Color;

    }
}
}
