package Java;
public class TicTacToe extends TicTacToeClasses {    
    public static void main(String[] args) {
        boolean continues = true;
        String answer;
        //while (continues == true) {
            String input;
            int position;
            int row = 0;
            int column;
            boolean gameOver = false;
            int numOfMoves = 0;
            int playerToggle = 1;
            TicTacToe bd = new TicTacToe();
            bd.TicTacToe();
            System.out.println("New game started");
            bd.printBoard();
            while (gameOver == false) {
                input = bd.askForInput("Enter your move");
                row = bd.parseRow(input);
                column = bd.parseColumn(input);
                position = bd.mapPosition(row, column);
                if (column >= 0 && column <=2 && row >= 0 && row <= 2 && bd.positionTaken(position) == true) {
                    if (playerToggle == 1) {
                        bd.setPosition(position, playerToggle);
                        bd.printBoard();
                        playerToggle = 2;
                        numOfMoves += 1;
                        if (bd.win() == true) {
                            System.out.println("Player 1 wins");
                            gameOver = true;
                        }
                        else if (numOfMoves == 9) {
                            System.out.println("Draw");
                            gameOver = true;
                        }


                    }
                    else {
                        bd.setPosition(position, 2);
                        bd.printBoard();
                        playerToggle = 1;
                        numOfMoves += 1;
                        if (bd.win() == true) {
                            System.out.println("Player 2 wins");
                            gameOver = true;
                        }
                        else if (numOfMoves == 9 ) {
                            System.out.println("Draw");
                            gameOver = true;
                        }
                    }
                } 
                else if (bd.positionTaken(position) == false) {
                    System.out.println("Position is taken");
                }
                else {
                    System.out.println("Input is invalid");
                }



            }
            answer = bd.askForInput("Would you like to start a new game? (Yes to start a new game, No to exit)");
            /*if (answer.equals("Yes")) {
                continues = true;
            } else {
                continues = false;
            }
        }*/
            

    }
}