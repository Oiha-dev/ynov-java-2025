package fr.ynov.java.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class interfaceGUI {
    private static RockPaperScissors game = new RockPaperScissors();
    private static JLabel resultLabel;
    private static JLabel scoreLabel;
    private static JLabel computerChoiceLabel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Rock Paper Scissors Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JPanel titlePanel = new JPanel();
        JLabel titleLabel = new JLabel("Rock Paper Scissors");
        titlePanel.add(titleLabel);
        frame.add(titlePanel, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));

        computerChoiceLabel = new JLabel("Computer choice: ");
        resultLabel = new JLabel("Make your choice!");
        scoreLabel = new JLabel("Score - You: 0 | Computer: 0");

        computerChoiceLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        resultLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        scoreLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        centerPanel.add(Box.createVerticalStrut(20));
        centerPanel.add(computerChoiceLabel);
        centerPanel.add(Box.createVerticalStrut(10));
        centerPanel.add(resultLabel);
        centerPanel.add(Box.createVerticalStrut(10));
        centerPanel.add(scoreLabel);

        frame.add(centerPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        JButton rockButton = new JButton("Rock");
        JButton paperButton = new JButton("Paper");
        JButton scissorsButton = new JButton("Scissors");
        JButton resetButton = new JButton("Reset Score");

        buttonPanel.add(rockButton);
        buttonPanel.add(paperButton);
        buttonPanel.add(scissorsButton);
        buttonPanel.add(resetButton);

        frame.add(buttonPanel, BorderLayout.SOUTH);

        rockButton.addActionListener(e -> playGame(RockPaperScissors.Choice.ROCK));

        paperButton.addActionListener(e -> playGame(RockPaperScissors.Choice.PAPER));

        scissorsButton.addActionListener(e -> playGame(RockPaperScissors.Choice.SCISSORS));

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.resetScores();
                updateScore();
                resultLabel.setText("Scores reset! Make your choice.");
                computerChoiceLabel.setText("Computer choice: ");
            }
        });

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void playGame(RockPaperScissors.Choice playerChoice) {
        RockPaperScissors.Choice computerChoice = game.getComputerChoice();
        computerChoiceLabel.setText("Computer choice: " + computerChoice);

        String result = game.play(playerChoice);
        resultLabel.setText(result);
        updateScore();
    }

    private static void updateScore() {
        scoreLabel.setText("Score - You: " + game.getPlayerScore() +
                " | Computer: " + game.getComputerScore());
    }
}
