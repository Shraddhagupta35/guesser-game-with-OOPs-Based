package PROJECTS;
import java.util.*;


class Guesser{

    int guessNum;

    public int GuessingNum(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser! kindly guess the number:");
        guessNum = sc.nextInt();
        
        return guessNum;
        
    }
}

class Player{
     int guessNum;

     public int guessingNumber(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Player! kindly guess the number:");
        guessNum = sc.nextInt();

        return guessNum;

     }
}

class Umpire{

    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    
    public void collectNumFromGuesser(){

        Guesser G = new Guesser();
        numFromGuesser = G.GuessingNum();
    }

    public void collectNumFromPlayer(){
        
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        numFromPlayer1 = p1.guessingNumber();
        numFromPlayer2 = p2.guessingNumber();
        numFromPlayer3 = p3.guessingNumber();

    }

    public void compare(){

        if(numFromGuesser == numFromPlayer1){

            if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3){

                System.out.println("All player are  guess the same number and won the game.");
            
            }else if(numFromGuesser == numFromPlayer2){
                
                System.out.println("Player1 and Player2 are won the game.");

            }else if(numFromGuesser == numFromPlayer3){

                System.out.println("Player1 & Player3 are won the game.");
            
            }else{

                System.out.println("Player1 won the game.");
            }

        }else if(numFromGuesser == numFromPlayer2){

            if(numFromGuesser == numFromPlayer3){

                System.out.println("Player2 & Player3 are won the game.");

            }else{

                System.out.println("Player2 won the game.");
            }

        }else if(numFromGuesser == numFromPlayer3){

            System.out.println("Player3 won the game.");

        }else{

            System.out.println("Your guess is too wrong \n Try again!");
        }
    }
    
}

public class Guesser_game{
    public static void main(String[] args) {

        System.out.println("Game strted :) ");
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();

        
    }
}