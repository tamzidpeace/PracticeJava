package Artificial_Intelligence;

import tictactoeminimax.GameState;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Mahadi Hasan Nahid
 */
class Game {

    GameState gameState = new GameState();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Java Tic Tac Toe with Minimax Algorithm");
            frame.setLayout(new GridLayout(3, 3));

            final Game game = new Game();
            final JButton[] buttons = new JButton[9];
            for (int i = 0; i < 9; i++) {

                final int idx = i;
                final JButton button = new JButton();
                buttons[i] = button;
                button.setPreferredSize(new Dimension(100, 100));
                button.setBackground(Color.WHITE);
                button.setFont(new Font(null, Font.PLAIN, 50));
                button.addMouseListener(new MouseListener() {

                    @Override
                    public void mouseReleased(MouseEvent arg0) {
                    }

                    @Override
                    public void mousePressed(MouseEvent arg0) {
                    }

                    @Override
                    public void mouseExited(MouseEvent arg0) {
                    }

                    @Override
                    public void mouseEntered(MouseEvent arg0) {
                    }

                    @Override
                    public void mouseClicked(MouseEvent arg0) {

                        button.setText("" + game.gameState.turn);
                        game.move(idx);

                        if (!game.gameState.gameEnd()) {

                            int best = game.gameState.bestMove();
                            buttons[best].setText("" + game.gameState.turn);
                            game.move(best);
                        }

                        if (game.gameState.gameEnd()) {
                            String message = "";
                            if (game.gameState.win('X')) {
                                message = "You Won!!";
                            } else if (game.gameState.win('O')) {
                                message = "Computer Won!!";
                            } else {
                                message = "Draw.";
                            }
                            JOptionPane.showMessageDialog(null, ""
                                    + message);
                        }
                    }
                });

                frame.add(button);
            }
            frame.pack();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }

    protected void move(int idx) {
        gameState = gameState.move(idx);
    }
}