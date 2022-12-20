package main.java;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMenu();
        int userInput = scanner.nextInt();
        StepTracker stepTracker = new StepTracker(scanner);
        while (userInput != 0) {
            if (userInput == 1) {
                stepTracker.enterMonth();
            } else if (userInput == 2) {
                stepTracker.printMap();
                stepTracker.printMonth();



            } else if (userInput == 3) {
                stepTracker.changeDefaultSteps();
            } else if (userInput == 4) {
                stepTracker.printDefaultSteps();
            }
            printMenu(); // печатаем меню ещё раз перед завершением предыдущего действия
            userInput = scanner.nextInt(); // повторное считывание данных от пользователя
        }
        System.out.println("Программа завершена");
    }

    private static void printMenu() {
        System.out.println("Приветствую!");
        System.out.println("Допустимые команды:");
        System.out.println("-- Для ввода количества шагов введите 1");
        System.out.println("-- Для вывода информации введите 2");
        System.out.println("-- Для ввода цели введите 3");
        System.out.println("-- Для вывода цели введите 4");
        System.out.println("-- Для выхода из программы введите 0");
    }
/*
     private static void printMap(StepTracker stepTracker) {
        stepTracker.getData().forEach((k, v) -> {
            System.out.println(StepTracker.MONTHES.get(k));
            Set<Map.Entry<Integer, Integer>> entries = v.entrySet();
            entries.forEach(entry -> System.out.println("День " + entry.getKey() + " " + entry.getValue() + " шагов"));
        });
    }
    private static void printMonth(StepTracker stepTracker, int monthNumber) {
        System.out.format("Количество пройденных шагов по дням за %s:\n", StepTracker.MONTHES.get(monthNumber));
        Map<Integer, Integer> integerIntegerMap = stepTracker.getData().get(monthNumber);
        if (integerIntegerMap != null && !integerIntegerMap.isEmpty()) {
            integerIntegerMap.forEach((k, v) ->
                    System.out.println(k + " день: " + v + " шагов. "));
        }
    }

    private static void printMidSteps(StepTracker stepTracker, int monthNumber) {
        System.out.format("Среднее количество шагов за %s:\n", StepTracker.MONTHES.get(monthNumber));
        Map<Integer, Integer> integerIntegerMap = stepTracker.getData().get(monthNumber);
        if (integerIntegerMap != null && !integerIntegerMap.isEmpty()) {
            int count = 0;
            Set<Map.Entry<Integer, Integer>> entries = integerIntegerMap.entrySet();
            for (Map.Entry<Integer, Integer> entry : entries) {
                count = count + entry.getValue();
            }
            System.out.format("%.2f\n", (float) count / 30);
        }
    }

    private static void printTotalCount(StepTracker stepTracker, int monthNumber) {
        System.out.format("Общее количество шагов за %s:\n", StepTracker.MONTHES.get(monthNumber));
        Map<Integer, Integer> integerIntegerMap = stepTracker.getData().get(monthNumber);
        if (integerIntegerMap != null && !integerIntegerMap.isEmpty()) {
            int count = 0;
            Set<Map.Entry<Integer, Integer>> entries = integerIntegerMap.entrySet();
            for (Map.Entry<Integer, Integer> entry : entries) {
                count = count + entry.getValue();
            }
            System.out.format("%d\n", count);
        }
    }

    private static void printMaxMonth(StepTracker stepTracker, int monthNumber) {
        System.out.format("Максмиальное количество шагов за %s:\n", StepTracker.MONTHES.get(monthNumber));
        Map<Integer, Integer> integerIntegerMap = stepTracker.getData().get(monthNumber);
        if (integerIntegerMap != null && !integerIntegerMap.isEmpty()) {
            int max = 0;
            Set<Map.Entry<Integer, Integer>> entries = integerIntegerMap.entrySet();
            for (Map.Entry<Integer, Integer> entry : entries) {
                if (max < entry.getValue()) {
                    max = entry.getValue();
                }
            }
            System.out.format("%d\n", max);
        }
    } */
}
