import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void sort(int[] numbers) {
        // write your code here
        for(int i = 0; i < numbers.length; i++){
            int min = numbers[i];
            int minId = i;
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[j] < min) {
                    min = numbers[j];
                    minId = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = min;
            numbers[minId] = temp;
        }

    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split("\\s+");
        int[] numbers = Arrays.stream(values)
                .mapToInt(Integer::parseInt)
                .toArray();
        sort(numbers);
        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));
    }
}