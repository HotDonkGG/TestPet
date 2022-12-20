import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> month = new HashMap<>();
        month.put(1, "Январь");
        month.put(2, "Февраль");
        month.put(3, "Март");
        month.put(4, "Апрель");
        month.put(5, "Май");
        month.put(6, "Июнь");
        month.put(7, "Июль");
        month.put(8, "Август");
        month.put(9, "Сентябрь");
        month.put(10, "Октябрь");
        month.put(11, "Ноябрь");
        month.put(12, "Декабрь");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите месяц: ");
        int input = scanner.nextInt();

        while (input != 0) {
            if(input >12) {
                System.out.println("На земле в году 12 месяцев");
            }
            switch (input) {
                case 1: {
                    System.out.println(month.get(1));
                }
                break;
                case 2: {
                    System.out.println(month.get(2));
                }
                break;
                case 3: {
                    System.out.println(month.get(3));
                }
                break;
                case 4: {
                    System.out.println(month.get(4));
                }
                break;
                case 5: {
                    System.out.println(month.get(5));
                }
                break;
                case 6: {
                    System.out.println(month.get(6));
                }
                break;
                case 7: {
                    System.out.println(month.get(7));
                }
                break;
                case 8: {
                    System.out.println(month.get(8));
                }
                break;
                case 9: {
                    System.out.println(month.get(9));
                }
                break;
                case 10: {
                    System.out.println(month.get(10));
                }
                break;
                case 11: {
                    System.out.println(month.get(11));
                }
                break;
                case 12: {
                    System.out.println(month.get(12));
                }
                break;
            }
            input = scanner.nextInt();
//            break;
        }
    }
}
