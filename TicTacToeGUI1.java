import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

public class TicTacToeGUI1 {
    private JFrame frame;
    private JPanel panel;
    private JButton[][] buttons;
    private JLabel statusLabel;
    private JButton resetButton;
    private JLabel xWinsLabel;
    private JLabel oWinsLabel;
    private boolean playerXTurn;
    private boolean gameOver;
    private int xWins;
    private int oWins;
    private int gameDuration; // Duration of each game in seconds
    private Timer gameTimer;
    private int secondsRemaining;

    public TicTacToeGUI1(int duration) {
        playerXTurn = true;
        gameOver = false;
        xWins = 0;
        oWins = 0;
        gameDuration = duration;
        secondsRemaining = gameDuration;

        frame = new JFrame("Tic Tac Toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel(new GridLayout(3, 3));
        buttons = new JButton[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton("");
                buttons[i][j].setFont(new Font("Arial", Font.BOLD, 48));
                buttons[i][j].addActionListener(new ButtonListener(i, j));
                panel.add(buttons[i][j]);
            }
        }

        statusLabel = new JLabel("Player X's Turn");
        statusLabel.setFont(new Font("Arial", Font.BOLD, 18));

        resetButton = new JButton("Reset");
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resetGame();
            }
        });

        xWinsLabel = new JLabel("Player X Wins: 0");
        oWinsLabel = new JLabel("Player O Wins: 0");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(statusLabel);
        buttonPanel.add(resetButton);
        buttonPanel.add(xWinsLabel);
        buttonPanel.add(oWinsLabel);

        frame.add(panel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setSize(300, 300);
        frame.setVisible(true);

        gameTimer = new Timer();
        gameTimer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                secondsRemaining--;
                statusLabel.setText("Time Remaining: " + secondsRemaining + " seconds");

                if (secondsRemaining <= 0) {
                    gameTimer.cancel();
                    endGame("Time's up!");
                }
            }
        }, 1000, 1000);
    }

    private void checkWin() {
        // Check for winning conditions...
        for (int i = 0; i < 3; i++) {
            if (buttons[i][0].getText().equals(buttons[i][1].getText()) && 
                buttons[i][1].getText().equals(buttons[i][2].getText()) && 
                !buttons[i][0].getText().equals("")) {
                endGame(buttons[i][0].getText());
                return;
            }
        }

        // Check vertical lines
        for (int i = 0; i < 3; i++) {
            if (buttons[0][i].getText().equals(buttons[1][i].getText()) && 
                buttons[1][i].getText().equals(buttons[2][i].getText()) && 
                !buttons[0][i].getText().equals("")) {
                endGame(buttons[0][i].getText());
                return;
            }
        }

        // Check diagonals
        if (buttons[0][0].getText().equals(buttons[1][1].getText()) && 
            buttons[1][1].getText().equals(buttons[2][2].getText()) && 
            !buttons[0][0].getText().equals("")) {
            endGame(buttons[0][0].getText());
            return;
        }

        if (buttons[0][2].getText().equals(buttons[1][1].getText()) && 
            buttons[1][1].getText().equals(buttons[2][0].getText()) && 
            !buttons[0][2].getText().equals("")) {
            endGame(buttons[0][2].getText());
            return;
        }

        // Check for tie
        if (!gameOver) {
            boolean tie = true;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (buttons[i][j].getText().equals("")) {
                        tie = false;
                    }
                }
            }
            if (tie) {
                endGame("Tie");
            }
        }
        // Rest of the code...
    }

    private void endGame(String winner) {
        gameOver = true;
        String message;
        if (winner.equals("Tie")) {
            message = "Game ended in a tie.";
        } else {
            message = "Player " + winner + " wins!";
            if (winner.equals("X")) {
                xWins++;
            } else if (winner.equals("O")) {
                oWins++;
            }
            updateWinLabels();
        }
        statusLabel.setText(message);
        disableButtons();
    }
    private void resetGame() {
        gameOver = false;
        playerXTurn = true;
        secondsRemaining = gameDuration;
        statusLabel.setText("Player X's Turn");
        enableButtons();
        gameTimer.cancel();
        gameTimer = new Timer();
        gameTimer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                secondsRemaining--;
                statusLabel.setText("Time Remaining: " + secondsRemaining + " seconds");

                if (secondsRemaining <= 0) {
                    gameTimer.cancel();
                    endGame("Time's up!");
                }
            }
        }, 1000, 1000);
    }

    private void disableButtons() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setEnabled(false);
            }
        }
    }

    private void enableButtons() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setEnabled(true);
                buttons[i][j].setText("");
            }
        }
    }

    private void updateWinLabels() {
        xWinsLabel.setText("Player X Wins: " + xWins);
        oWinsLabel.setText("Player O Wins: " + oWins);
    }

    private class ButtonListener implements ActionListener {
        private int row;
        private int col;

        public ButtonListener(int row, int col) {
            this.row = row;
            this.col = col;
        }

        public void actionPerformed(ActionEvent e) {
            if (gameOver || !buttons[row][col].getText().equals("")) {
                return;
            }

            if (playerXTurn) {
                buttons[row][col].setText("X");
                statusLabel.setText("Player O's Turn");
            } else {
                buttons[row][col].setText("O");
                statusLabel.setText("Player X's Turn");
            }

            playerXTurn = !playerXTurn;
            checkWin();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Game Duration : ");
        int gameDuration = sc.nextInt(); // Specify the game duration in seconds
        SwingUtilities.invokeLater(() -> new TicTacToeGUI1(gameDuration));
    }
}
