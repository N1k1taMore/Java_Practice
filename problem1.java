//percentage Calculator
import java.util.Scanner;

class Calculate{
    private float m1,m2,m3,m4,m5;
    private float total;
    Scanner sc=new Scanner(System.in);
    public void getMarks(){
        System.out.println("Enter marks of subject 1");
        m1=sc.nextFloat();
         System.out.println("Enter marks of subject 2");
        m2=sc.nextFloat();
         System.out.println("Enter marks of subject 3");
        m3=sc.nextFloat();
         System.out.println("Enter marks of subject 4");
        m4=sc.nextFloat();
         System.out.println("Enter marks of subject 5");
        m5=sc.nextFloat();
    }
    public void getPercentage(){
        total=m1+m2+m3+m4+m5;
        float percent=(total)/5.0;
        System.out.println("The Percentage Obtained is :"+percent +"%");
    }
}
class Main{
    public static void main(String[] args) {
        Calculate s1=new Calculate();
        s1.getMarks();
        s1.getPercentage();
    }
}