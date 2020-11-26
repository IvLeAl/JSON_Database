import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        String stringNew = scanner.nextLine();

        Arrays.stream(stringNew.split(" ")).sorted(Comparator.comparingInt(String::length).reversed())
                .limit(1).peek(x -> x.length()).forEach(System.out::println);

    }
}

    public static void main(String[] args) {

    }