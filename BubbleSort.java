public class BubbleSort {
    public static int[] numbers = new int[]{56, 45, 89, 1, 45, 13, 4, 69, 11, -89};

    public static void main(String[] args) {
        print();
        sort();
        System.out.println("\nОтсортированные числа в натуральном порядке:");
        print();
    }

    public static void sort() {
        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            for(int i = 1; i < numbers.length; i ++ ){
                if(numbers[i] < numbers[i-1]){
                    int temp = numbers[i];
                    numbers[i] = numbers[i-1];
                    numbers[i-1] = temp;
                    isSorted = false;
                }
            }
        }

    }
    public static void print() {
        for (int number : numbers) {
            System.out.print(number + "\t");
        }
    }
}
