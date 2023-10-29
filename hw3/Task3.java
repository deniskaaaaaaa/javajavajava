package hw3;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class Task3 {
    public static <T>Map <T, Integer> freqDict(List<T> items)
    {
        Map<T, Integer> freqMap = new HashMap<>();
        for (T item : items) {
            freqMap.put(item, freqMap.getOrDefault(item, 0) + 1);
        }
        return freqMap;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        List<String> inputList = new ArrayList<>();
        System.out.println("Введите список: ");
        String input;
        while (!(input = scanner.nextLine()).isEmpty())
        {
            inputList.add(input);
        }
        freqDict(inputList).forEach((key, value) -> {
            System.out.println('"' + key + '"' + " : " + value);
        });
    }
}
