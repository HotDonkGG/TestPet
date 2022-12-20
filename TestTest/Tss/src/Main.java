import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(-555550);
        list.add(-40000);
        int findMax = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > findMax) {
                findMax = list.get(i);
            }

        }
        System.out.println(findMax);


    }
}