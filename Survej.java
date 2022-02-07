import java.util.Arrays;

public class Survej {
    
    public static void main(String[] args) {
        
        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6}
        }; 
 
        numbers[1][1] = 7;
        System.out.println(Arrays.toString(numbers));
    }

 
}
