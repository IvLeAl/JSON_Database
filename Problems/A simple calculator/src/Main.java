import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int FirstDigit = 0;
        int SecondDigit = 0;
        String Operation;


        //Вводим в консоль данные
        String expression = scanner.nextLine();

        //Разделяем строку на массив строк
        String[] expressionArr = expression.split(" ");

        // Пишем исключения
       // try {

            //Приводим значения массива к числу
            FirstDigit = Integer.parseInt(expressionArr[0]);
            SecondDigit = Integer.parseInt(expressionArr[2]);
            /*if (FirstDigit < 1 || SecondDigit > 10 || SecondDigit < 1 || FirstDigit > 10) {
                System.out.println("Неверный формат ввода. Ведите выражение от 1 до 10");
       //     }*/
       // } catch (Exception e) {
        //    System.out.println("Попробуйте еще раз");
      //  }
        //Приводим операнд к строке
        Operation = expressionArr[1];


        //Калькулятор
        switch (Operation) {
            case "+":
                System.out.println(FirstDigit + SecondDigit);
                break;
            case "-":
                System.out.println(FirstDigit - SecondDigit);
                break;
            case "*":
                System.out.println(FirstDigit * SecondDigit);
                break;
            case "/":
                if ( SecondDigit == 0) {
                    System.out.println("Division by 0!");
                } else
                    System.out.println(FirstDigit / SecondDigit);
                break;
        }
    }
}
