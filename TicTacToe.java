import java.util.Scanner;

public class TicTacToe {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        // int a,b = Integer.parseInt(scanner.nextLine());
        char[][] board = new char[3][3];
        board = tableGenerate();
        for(int i = 0; i < 9; i++) {
            if(i % 2 == 0) {
                System.out.println("Turn: X");
                int spot[] = askUser(board);
                board[spot[0]][spot[1]] = 'X';
                printBoard(board);
            }else {
                System.out.println("Turn: O");
                int spot[] = askUser(board);
                board[spot[0]][spot[1]] = 'O';
                printBoard(board);
                
            }
        }
        // printBoard(tableGenerate());
        
    }
    public static int[] askUser(char[][] board) {
        System.out.print("Pick a row and a column number: ");
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        while(board[row][column] == 'O' || board[row][column] == 'X'){
            System.out.print("Spot is takink. Please chose another: ");
            row = scanner.nextInt();
            column = scanner.nextInt();
        }
        return new int[]{row, column};
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
    static char[][] tableGenerate() {
        char[][] board = new char[3][3];

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                
                board[i][j] = '-';
            }
        }
        return board;
    }
    // static char xOrO() {
    //     double randomNumber = Math.random() * 10;
    //     char ticOrToe = ' ';
    //     System.out.println(randomNumber);
    //     if(randomNumber + 1 < 5){
    //         ticOrToe = 'O'; 
    //     }else {
    //         ticOrToe = 'X';
    //     }
    //     return ticOrToe;
    // }
}
