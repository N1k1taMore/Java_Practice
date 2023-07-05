//custom Calculator implementing exception handling using try,catch ,throw,throws keywords.
import java.util.Scanner;

class CannotDivideByZero extends Exception{
    public String toString(){
        return "Cannot Divide By Zero";
    }
    public String getMessage(){
        return "Cannot Divide By Zero";
    }
}
class MaxInput extends Exception{
    public String toString(){
        return "Maximum input limit exceeds";
    }
    public String getMessage(){
        return "Input Cannot be greater than 100000";
    }
}

class calculator{
    double a,b;
    Scanner sc=new Scanner(System.in);
    public double getinput(){
        boolean x=true;
        double num=0;
        System.out.println("Enter a Number");
        while(x){
            num=sc.nextDouble();
            if(num>100000){
                try{
                    throw new MaxInput();
                }
                catch(MaxInput m){
                    System.out.println(m.getMessage());
                    System.out.println("Enter a valid Number");
                }
            }
            else{
                 x=false;
            }
        }
        return num;
    }
    double add(){
        a=getinput();
        b=getinput();
        return a+b;
    }
    double subtract(){
        a=getinput();
        b=getinput();
        return a-b;
    }
    double multiply(){
        a=getinput();
        b=getinput();
        return a*b;
    }
    double divide()throws CannotDivideByZero{
        a=getinput();
        b=getinput();
        if(b==0){
            throw new CannotDivideByZero();
        }
        return a/b;
    }
   
}
class main_class{
    public static void main(String[] args)throws CannotDivideByZero{
        calculator c=new calculator();
        System.out.println(c.add());
        System.out.println(c.subtract());
        System.out.println(c.divide());
        System.out.println(c.multiply());
    }
}