import java.io.FilterOutputStream;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            double result = 0d;
            System.out.println("Какое действие хотите выполнить: 1, 2, 3");
            int userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    firstMove();

                    break;
                case 2:
                    secondMove(result);
                    break;
                case 0:
                    System.out.println("Выход");
                    break;
                default:
                    System.out.println("Такой команды нет");
            }
        }
    }

    public static void firstMove() {
        double a = 0D;
        double b = 0D;
        double result = 0D;
        char c;
        System.out.println("Введите число");
        a = scanner.nextDouble();
        System.out.println("Введите число");
        b = scanner.nextDouble();
        System.out.println("Действие");
        c = scanner.next().charAt(0);
        switch (c) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
        }
        System.out.println("Результат = " + result);
    }

    public static void secondMove(double result) {
        double d = 0d;
        char x;
        System.out.println("Введите число");
        d = scanner.nextDouble();
        System.out.println("Действие");
        x = scanner.next().charAt(0);
        switch (x) {
            case '+':
                result = result + d;
                break;
            case '-':
                result = result - d;
                break;
            case '*':
                result = result * d;
                break;
            case '/':
                result = result / d;
                break;
        }
        System.out.println("Результат = " + result);
    }
}






