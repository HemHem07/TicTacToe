package Java;
import java.util.*;
public class TicTacToeClasses {
    private Scanner sc = new Scanner(System.in);
    private String[] board = new String[9];
    public int parseRow(String input) {
        if (input.charAt(0)-'A' <= 2 && input.charAt(0)-'A' >= 0) {
            return input.charAt(0)-'A';
        }
        else {
            return -1;
        }

    }
    public int parseColumn(String input) {
        if (0 <= input.charAt(1)-'1' && input.charAt(1)-'1' <= 2) {
            return input.charAt(1)-'1';
        }
        else {
            return -1;
        }
    }
    public int mapPosition(int row, int col) {
        return (3 * row) + col;
    }
    public void setPosition(int position, int player) {
        if (player == 1) {
            board[position] = "X";
        } else {
            board[position] = "O";
        }

    }
    public boolean win() {

        for (int i = 0; i < 3; i++) {
            if (board[i * 3] != "-" && board[(i * 3) + 1] == board[i * 3] && board[(i * 3) + 2] == board[i * 3]) {
                return true;
            }
            else if (board[i] != "-" && board[i] == board[i + 3] && board[i] == board[i+6]) {
                return true;
            }
        }
        if (board[0] != "-" && board[0] == board[4] && board[0] == board[8]) {
            return true;
        }
        else if (board[2] != "-" && board[2] == board[4] && board[2] == board[6]) {
            return true;
        }
        return false;
    }
    public void TicTacToe() {
        for (int i = 0; i < board.length; i++) {
            board[i] = "-";
        }
        
    }
    
    public void printBoard() {
        printRow(0);
        printLine();
        printRow(1);
        printLine();
        printRow(2);
    }
    public boolean positionTaken(int position) {
        if (board[position] != "-") {
            return false;
        }
        return true;
    }
    public void printRow(int row) {
        for (int i = 3 * row; i < (3 * row) + 2; i++) {
            System.out.print(board[i]);
            System.out.print("\t|");
        }
        System.out.print(board[(3*row)+2]);
        System.out.println();
    }
    public void printLine() {
        System.out.print("------------------------");
        System.out.println();
    }
    public String askForInput(String message) {
        System.out.println(message);
        return sc.nextLine();
    }
}

