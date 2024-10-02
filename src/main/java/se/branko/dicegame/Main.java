package se.branko.dicegame;

public class Main {
    public static void main(String[] args) {
        DiceGame game = new DiceGame();
        game.playerSetup();
        game.playDice();
    }
}
