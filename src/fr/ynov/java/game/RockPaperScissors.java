package fr.ynov.java.game;

import java.util.Random;

public class RockPaperScissors {
    public enum Choice {
        ROCK, PAPER, SCISSORS
    }

    private int playerScore = 0;
    private int computerScore = 0;

    public Choice getComputerChoice() {
        Random random = new Random();
        int choice = random.nextInt(3);
        return Choice.values()[choice];
    }

    public String play(Choice playerChoice) {
        Choice computerChoice = getComputerChoice();

        if (playerChoice == computerChoice) {
            return "Tie! Both chose " + playerChoice;
        } else if ((playerChoice == Choice.ROCK && computerChoice == Choice.SCISSORS) ||
                (playerChoice == Choice.PAPER && computerChoice == Choice.ROCK) ||
                (playerChoice == Choice.SCISSORS && computerChoice == Choice.PAPER)) {
            playerScore++;
            return "You win! " + playerChoice + " beats " + computerChoice;
        } else {
            computerScore++;
            return "Computer wins! " + computerChoice + " beats " + playerChoice;
        }
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public void resetScores() {
        playerScore = 0;
        computerScore = 0;
    }
}