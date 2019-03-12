package tictactoeminimax;

import java.util.LinkedList;

/**
 * @author Mahadi Hasan Nahid
 */

public class GameState {

    private char[] board;
    public char turn;

    public GameState() {
        this.board = "         ".toCharArray(); // size = 9
        this.turn = 'X';
    }

    private GameState(char[] board, char turn) {
        this.board = board;
        this.turn = turn;
    }

    @Override
    public String toString() {
        return new String(board);
    }

    public GameState move(int i) {
        char[] newBoard = board.clone();
        newBoard[i] = turn;
        return new GameState(newBoard, turn == 'X' ? 'O' : 'X');
    }

    private Integer[] possibleMoves() {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < board.length; i++) {
            if (board[i] == ' ') {
                list.add(i);
            }
        }
        Integer[] array = new Integer[list.size()];
        list.toArray(array);

        return array;
    }

    private boolean win_line(char turn, int start, int step) {
        for (int i = 0; i < 3; i++) {
            if (board[start + step * i] != turn) {
                return false;
            }
        }
        return true;
    }

    public boolean win(char turn) {
        int dimension = 3;
        for (int i = 0; i < dimension; i++) {
            if (win_line(turn, i * dimension, 1) || win_line(turn, i, dimension)) {
                return true;
            }
        }

        return win_line(turn, dimension - 1, dimension - 1) || win_line(turn, 0, dimension + 1);

    }

    private int minimax() {
        if (win('X')) {
            return 100;
        }
        if (win('O')) {
            return -100;
        }

        if (possibleMoves().length == 0) {
            return 0;
        }

        Integer mm = null;
        for (Integer idx : possibleMoves()) {
            Integer value = move(idx).minimax();
            if (mm == null || turn == 'X' && mm < value || turn == 'O'
                    && value < mm) {
                mm = value;
            }

        }

        return mm + (turn == 'X' ? -1 : 1);

    }

    public int bestMove() {
        Integer mm = null;
        int best = -1;
        for (Integer idx : possibleMoves()) {
            Integer value = move(idx).minimax();
            if (mm == null || turn == 'X' && mm < value || turn == 'O'
                    && value < mm) {
                mm = value;
                best = idx;
            }
        }
        return best;
    }

    public boolean gameEnd() {
        return win('X') || win('O') || possibleMoves().length == 0;
    }
}