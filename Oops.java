public class Oops {
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="Dheeraj";
        s1.roll_no=12;
        s1.mob_no="9508304216";
      s1.age=21;
        System.out.println("Required Name = "+s1.name);
        System.out.println("Required roll no. ="+s1.roll_no); 
        System.out.println("Required mob no. ="+s1.getMobile());
        System.out.println(s1.getage());
}

static class  Student{
        String name;
        int  roll_no;
        private String mob_no;
        private int age;
        int getage(){
            return this.age;
        }
        void setage(int Age){
            this.age=Age;
        }
        String getMobile(){
            return this.mob_no;
        }
        void setName(String naMe,int roll){
           this.name=naMe;
           this.roll_no=roll;
        }
           void setMobile(String mob){
            this. mob_no=mob;
           }
          
        }
    }