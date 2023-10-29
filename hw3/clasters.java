package hw3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class clasters {
    public static String[] clusterize(String s) {
        List<String> clusters = new ArrayList<>();
        int counter = 0;
        int clusterStart = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                counter = counter + 1;
            else if (s.charAt(i) == ')')
                counter = counter - 1;

            if (counter == 0) {
                String cluster = s.substring(clusterStart, i + 1);
                clusters.add(cluster);
                clusterStart = i + 1;
            }
        }

        return clusters.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String userInput = scanner.nextLine();
        scanner.close();

        String[] result = clusterize(userInput);
        for (String cluster : result) {
            System.out.println(cluster);
        }
    }
}
