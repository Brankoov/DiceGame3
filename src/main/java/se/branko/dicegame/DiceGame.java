package se.branko.dicegame;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    private Player player1, player2;

    Scanner input = new Scanner(System.in);


    public void playerSetup(){

        System.out.println("Hello and welcome to the Dice game!");

        System.out.println("Player one name: ");
        String name1 = input.nextLine();
        player1 = new Player(name1);

        System.out.println("Player two name: ");
        String name2 = input.nextLine();
        player2 = new Player(name2);

    }
    public void playDice(){

        System.out.println("Time to play dice!\n");
        System.out.println(player1.getName()+ " will throw the first dice");
        System.out.println("Press ENTER to throw first dice");
        input.nextLine();
        player1.rollDice();
        System.out.println(player1.getName() +" total score is: " + player1.getScore());


        System.out.println("\nNow its time for "+player2.getName() +" to throw dice!");
        System.out.println("press ENTER to throw first dice");
        input.nextLine();
        player2.rollDice();
        System.out.println(player2.getName() +" total score is: "+ player2.getScore());

        if(player1.getScore() > player2.getScore()){
            System.out.println("\n"+ player1.getName() +" Wins with score: "+player1.getScore());
        }
        else if(player2.getScore() > player1.getScore()){
            System.out.println("\n"+ player2.getName() +" Wins with score: "+player2.getScore());
        }
        else{
            System.out.println("\nIts a tie! The game has to be settled, try again!");
            playDice();
        }
        input.close();
    }
}
