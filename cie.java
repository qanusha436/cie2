package cie;

public class cie {
        int a=5,b=3;
        int sum=a+b;
        int sub=a-b;
        int mult=a*b;
        int div=a/b;
    
        void display(){
            System.out.println("addition of two numbers:"+sum);
            System.out.println("substration of two numbers:"+sub);
            System.out.println("multiplication of two numbers:"+mult);
            System.out.println("division of two numbers:"+div);
    
       }
       public static void main(String[] args){
        cie c=new cie();
        c.display();
       }
    
    }

