//percentage Calculator
import java.util.Scanner;
import java.util.Random;

class Game{
    private int input;
    Scanner sc=new Scanner(System.in);
    Random random=new Random();
    public void play(){
        input=sc.nextInt();
        int compinput=random.nextInt(3);
        if(input==compinput){
            System.out.println("Draw");
        }
        else if((input==0 && compinput==2) ||
            (input==1 && compinput==0) ||
            (input==2 && compinput==1) ){
                System.out.println("You Win");
            }
        else{
            System.out.println("Computer Win");
        }
        if(compinput==0){
        System.out.println("Computer choice: Rock");
        }
        else if(compinput==1){
        System.out.println("Computer choice: Paper");
        }
        else if(compinput==2){
        System.out.println("Computer choice: Scissor");
        }
    }
}
class Main{
    public static void main(String[] args) {
        System.out.println("Enter \n 0-Rock \n 1-Paper \n 2-Scissor");
        Game g=new Game();
        g.play();
        
    }
}