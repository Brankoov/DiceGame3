package se.branko.dicegame;

import java.util.Random;
import java.util.Scanner;

public class Player {
    private String name;
    private int score;

    Scanner sc = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }
    public void rollDice() {
        Random rand = new Random();
        int roll1 = rand.nextInt(6) + 1;
        int roll2 = rand.nextInt(6) + 1;
        score = roll1 + roll2;
        System.out.println(name+ " Throws first dice and rolled a "+roll1+"!");
        System.out.println("Press ENTER to roll again");
        sc.nextLine();
        System.out.println(name+ " Throws second dice and rolled a "+roll2+"!");
    }


    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }

}
