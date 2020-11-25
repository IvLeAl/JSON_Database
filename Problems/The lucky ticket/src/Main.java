import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here


        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine(); // вводим с консоли строку чисел
        String[] arr = number.split(""); // создаем массив где строка разбивается на индексы массива

        int[] arr2 = new int[arr.length]; // создаем новый массив

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = Integer.parseInt(arr[i]);// преобразуем строчные индексы массива в числа
        }

        if (arr2[0] + arr2[1] + arr2[2] == arr2[3] + arr2[4] + arr2[5]) { // сравниваем условие
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}