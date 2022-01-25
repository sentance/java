import java.util.Arrays;

public class ColorPrintRandomNumber {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String TEXT_RESET = "\u001B[0m";
    public static void main(String[] args) {
        
        int[][] arr = new int[20][10];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = randomNumber(10);
            }
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]== 0) {
                    System.out.print(ANSI_RED + arr[i][j] + TEXT_RESET + "\t");
                } else if (arr[i][j] != 0) {
                    System.out.print(arr[i][j] + "\t");
                }
            }
            System.out.println("\n");
        }

    }
    /**
     * function: randomNumber
     * @param b - accept max random int
     * @return random (int) number
     */
    static int randomNumber(int b) { 
        double randmNum = Math.random()*b;
        
        if (randmNum < 1) {
            return 0;
        }
        return (int)(randmNum + 1);
    }
}