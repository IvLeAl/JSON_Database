import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        String[] parts = words.split(" ");


        for (int i = 0;i < parts.length; i++) {
            parts[i] = [i + i];
        }


    }
}