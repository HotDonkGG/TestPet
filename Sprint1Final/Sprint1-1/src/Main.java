import java.util.Scanner;
import java.util.Map;
import java.util.*;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMenu();
        int userInput = scanner.nextInt();
        StepTracker stepTracker = new StepTracker(scanner);

        while (userInput != 0) {
            // обработка разных случаев
            if (userInput == 1) {
                stepTracker.enterMonth();
            } else if (userInput == 2) {
                stepTracker.printMap();
                stepTracker.printDefaultSteps();
            } else if (userInput == 3) {
                stepTracker.changeDefaultSteps();

            } else if (userInput == 4) {
                System.out.println(">>> Выберети месяц ");
                stepTracker.printAllCount(scanner.nextInt());

            }
            printMenu(); // печатаем меню ещё раз перед завершением предыдущего действия
            userInput = scanner.nextInt(); // повторное считывание данных от пользователя
        }
        System.out.println("Программа завершена");
    }

    private static void printMenu() {
        System.out.println("Привет!");
        System.out.println("Допустимые команды:");
        System.out.println(">>> Для ввода количества шагов введите 1");
        System.out.println(">>> Для вывода информации введите 2");
        System.out.println(">>> Для ввода цели введите 3");
        System.out.println(">>> Для вывода статистики введите 4");
        System.out.println(">>> Для выхода из программы введите 0");
    }

}
