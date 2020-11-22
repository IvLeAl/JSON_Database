import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String  figure = scanner.nextLine();

        double count ;


        switch (figure) {
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();

                count = (a + b + c) / 2;
                System.out.println(count);
                break;
            case "rectangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                count = a * b;
                System.out.println(count);
                break;
            case "circle":
                double r = scanner.nextDouble();
                count = r * r * 3.14;
                System.out.println(count);
                break;
            default:
                System.out.println("Не верное знаече");
                break;
        }


    }
}

