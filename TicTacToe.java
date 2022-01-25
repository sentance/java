import java.util.Scanner;

public class TicTacToe {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        // int a,b = Integer.parseInt(scanner.nextLine());


        printBoard(tableGenerate());
        
    }
    /**
     * Function name: printBoard()
     * 
     * @param board (char[][])
     * inside the function we are printing a char in array
     */
    static void printBoard(char[][] board) {
        for(int i = 0; i < board.length; i++) {
            System.out.println();
            for(int j = 0; j < board[i].length; j++){
                System.out.print("\t" + board[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
    /**
     * function name: userPickIndexOnBoard()
     * @return [] with two indexes on board
     */
    static int[] userPickIndexOnBoard() {
        // int[] userPickIndexOnBoard = new int[2];
        // int a,b = scanner.nextInt();
        // int lineX = userPickIndexOnBoard[0];
        // for(int i = 0; i < userPickIndexOnBoard.length; i++) {
        //     System.out.println("Write a row number and column number from 0 to 2 space separated");
            
        // }
        
        // return userPickIndexOnBoard;

    }
    static char[][] tableGenerate() {
        char[][] board = new char[3][3];

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                
                board[i][j] = xOrO();
            }
        }
        return board;
    }
    static char xOrO() {
        double randomNumber = Math.random() * 10;
        char ticOrToe = ' ';
        System.out.println(randomNumber);
        if(randomNumber + 1 < 5){
            ticOrToe = 'O'; 
        }else {
            ticOrToe = 'X';
        }
        return ticOrToe;
    }
}
