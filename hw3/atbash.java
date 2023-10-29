package hw3;
import java.util.Scanner;
public class atbash {
    public static String atbashcipher(String s) {
        char[] satbash = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char code = s.charAt(i);
            int codecode = (int) code;
            if (codecode >= 65 && codecode <= 90) {
                satbash[i] = (char) ('A' + 'Z' - codecode);
            } else if (codecode >= 97 && codecode <= 122) {
                satbash[i] = (char) ('a' + 'z' - codecode);
            } else {
                satbash[i] = s.charAt(i);
            }
        }
        return new String(satbash);
    }
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String userInput;
        userInput = scanner.nextLine();
        scanner.close();
        System.out.println(atbashcipher(userInput));
    }
}
