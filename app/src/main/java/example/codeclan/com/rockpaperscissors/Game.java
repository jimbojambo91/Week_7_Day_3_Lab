package example.codeclan.com.rockpaperscissors;

import java.util.Random;

/**
 * Created by user on 19/04/2017.
 */

public class Game {
    private String hand1;
    private String hand2;

    public Game(String hand1){
        this.hand1 = hand1;
        this.hand2 = getComputerHand();
    }

    public String getHandOne() {
        return this.hand1;
    }

    public String getHandTwo() {
        return this.hand2;
    }

    public String getResult(){
        if(hand1.equals(hand2)){
            return "Draw";
        }
        if(hand1.equals("Paper") && (hand2.equals("Rock"))){
            return "Player Wins by playing Paper!";
        }
        if(hand1.equals("Paper") && (hand2.equals("Scissors"))){
            return "Computer Wins by playing Scissors";
        }
        if(hand1.equals("Rock") && (hand2.equals("Scissors"))){
            return "Player Wins by playing Rock";
        }
        if(hand1.equals("Rock") && (hand2.equals("Paper"))){
            return "Computer Wins by playing Paper";
        }
        if(hand1.equals("Scissors") && (hand2.equals("Paper"))){
            return "Player Wins by playing Scissors";
        }
        if(hand1.equals("Scissors") && (hand2.equals("Rock"))){
            return "Computer Wins by playing Rock";
        }
        return null;

    }

    public String getComputerHand() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        Random rand = new Random();
        int listSize = choices.length;
        int index = rand.nextInt(listSize);
        String compHand = choices[index];
        return compHand;
    }
}
