import java.util.Scanner;
import java.util.Map;
import java.util.*;
import java.util.HashMap;

public class StepTracker {

    private Scanner scanner;

    public StepTracker(Scanner scanner) {
        this.scanner = scanner;
    }

        public int defaultSteps = 10000;

    private Map<Integer, Map<Integer, Integer>> data = new HashMap<>();

    public Map<Integer, Map<Integer, Integer>> getData() {
        return data;
    }

    public final Map<Integer, String> months = new HashMap<>() {
        {
            //наполненение данными
            put(0, "Январь");
            put(1, "Февраль");
            put(2, "Март");
            put(3, "Апрель");
            put(4, "Май");
            put(5, "Июнь");
            put(6, "Июль");
            put(7, "Август");
            put(8, "Сентябрь");
            put(9, "Октябрь");
            put(10, "Ноябрь");
            put(11, "Декабрь");
        }
    };

    public void enterMonth() {
        int selectedMonth = 0;
        while (selectedMonth != 12) {
            System.out.println("Меню выбора месяца:");
            //вывод месяцев на экран
            months.forEach((k, v) -> System.out.println(v + " > " + k));
            System.out.println("Для возварата в главное меню наберите - 12");
            //ввод пользователем месяца
            selectedMonth = scanner.nextInt();
            switch (selectedMonth) {
                case 12:
                    break;
                case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11:
                    //месяц выбран, надо выбрать день.
                    System.out.println("Отлично! Выбранный месяц - " + months.get(selectedMonth));
                    int selectedDay = enterDay(selectedMonth);
                    if (selectedDay == 0) {
                        return;
                    }
                    break;
                default:
                    System.out.println("Вы ввели недопустимое значение.");
                    break;
            }
        }
    }

    public int enterDay(int month) {
        System.out.println("Теперь необходимо выбрать день от 1 до 30. Для выхода на предыдущий шаг введите 0");
        int selectedDay = scanner.nextInt();
        while (selectedDay != 0) {
            if (selectedDay > 30 || selectedDay < 0) {
                System.out.println("Необходимо выбрать день от 1 до 30. Попробуйте еще раз. Для выбора месяца 0");
                selectedDay = scanner.nextInt();
            } else {
                System.out.format("Осталось ввести количество шагов за %d день\n", selectedDay);
                int i = enterSteps(month, selectedDay);
                if (i == -1) {
                    System.out.println("Вы вернулись в меню выбора дня");
                    System.out.println("Выберете день от 1 до 30. Для выхода на предыдущий шаг введите 0");
                    selectedDay = scanner.nextInt();
                } else if (i == 0) {
                    return 0;
                }
            }
        }
        return -1;
    }

    public int enterSteps(int month, int day) {
        System.out.format("Сколько шагов вы прошли?\n");
        System.out.format("Для возварата назад введите 0\n");
        int selectedSteps = scanner.nextInt();
        while (selectedSteps != 0) {

            if (selectedSteps < 0) {
                System.out.println("Попробуйте еще раз, значение должно быть больше 0");
                selectedSteps = scanner.nextInt();
            } else if (selectedSteps == 0) {
                return -1;
            } else {
                System.out.format("Отлично! В месяце - %s в день - %d вы прошли %d шагов\n",
                        months.get(month), day, selectedSteps);
                data.computeIfAbsent(month, k -> new HashMap<>()).put(day, selectedSteps);
                return 0;
            }
        }
        return -1;
    }

    public void printMap() {
        getData().forEach((k, v) -> {
            System.out.println(months.get(k));
            Set<Map.Entry<Integer, Integer>> entries = v.entrySet();
            entries.forEach(entry -> System.out.println("День " + entry.getKey() + " " + entry.getValue() + " шагов"));
        });
    }

    public void changeDefaultSteps() {
        System.out.println("Введите новое значение для вашей цели");
        int selectedSteps = scanner.nextInt();
        if (selectedSteps < 0) {
            System.out.println("Введите правильное значение ");
        } else if (selectedSteps == 0) {
            return;
        } else {
            setDefaultSteps(selectedSteps);
        }
    }

    public void setDefaultSteps(int defaultSteps) {
        this.defaultSteps = defaultSteps;
    }

    public int getDefaultSteps() {
        return defaultSteps;
    }

    public void printDefaultSteps() {
        System.out.println(getDefaultSteps());

    }

    public void printMonth(int monthNumber) {
        System.out.format("Количество пройденных шагов по дням за %s:\n", months.get(monthNumber));
        Map<Integer, Integer> integerIntegerMap = getData().get(monthNumber);
        if (integerIntegerMap != null && !integerIntegerMap.isEmpty()) {
            integerIntegerMap.forEach((k, v) ->
                    System.out.println(k + " день: " + v + " шагов. "));
        }
    }

    public void printMidSteps(int monthNumber) {
        System.out.format("Среднее количество шагов за %s:\n", months.get(monthNumber));
        Map<Integer, Integer> integerIntegerMap = getData().get(monthNumber);
        if (integerIntegerMap != null && !integerIntegerMap.isEmpty()) {
            int count = 0;
            Set<Map.Entry<Integer, Integer>> entries = integerIntegerMap.entrySet();
            for (Map.Entry<Integer, Integer> entry : entries) {
                count = count + entry.getValue();
            }
            System.out.format("%.2f\n", (float) count / 30);
        }
    }

    public void printTotalCount(int monthNumber) {
        System.out.format("Общее количество шагов за %s:\n", months.get(monthNumber));
        Map<Integer, Integer> integerIntegerMap = getData().get(monthNumber);
        if (integerIntegerMap != null && !integerIntegerMap.isEmpty()) {
            int count = 0;
            Set<Map.Entry<Integer, Integer>> entries = integerIntegerMap.entrySet();
            for (Map.Entry<Integer, Integer> entry : entries) {
                count = count + entry.getValue();
            }
            System.out.format("%d\n", count);
        }
    }

    public void printMaxMonth(int monthNumber) {
        System.out.format("Максмиальное количество шагов за %s:\n", months.get(monthNumber));
        Map<Integer, Integer> integerIntegerMap = getData().get(monthNumber);
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
    }

    public void printAllCount(int monthNumber) {
        printMonth(monthNumber);
        printTotalCount(monthNumber);
        printMidSteps(monthNumber);
        printMaxMonth(monthNumber);
        getStatistic(monthNumber);
    }


    public void getStatistic(int monthNumber) {
        Map<Integer, Integer> integerIntegerMap = getData().get(monthNumber);
        Integer stepsCount = 0;
        if (integerIntegerMap != null && !integerIntegerMap.isEmpty()) {
            for (Map.Entry<Integer, Integer> entry : integerIntegerMap.entrySet()) {

                Integer v = entry.getValue();
                stepsCount += v;
            }
        }
        double kKal = Converter.getKKal(stepsCount);
        double distance = Converter.getDistance(stepsCount);
        System.out.println("Кал. = " + kKal + " дистацния " + distance);
    }
}



