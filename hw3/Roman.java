package hw3;
import java.util.Scanner;
public class Roman {
    public static String convertToRoman(int arabic) {
        if (arabic < 1 || arabic > 3999) {
            return "Недопустимое число";
        }

        StringBuilder roman = new StringBuilder();

        int a1 = arabic / 1000;
        for (int i = 0; i < a1; i++) {
            roman.append("M");
        }
        arabic %= 1000;

        if (arabic >= 900) {
            roman.append("CM");
            arabic -= 900;
        } else {
            int a2 = arabic / 500;
            for (int i = 0; i < a2; i++) {
                roman.append("D");
            }
            arabic %= 500;
        }

        if (arabic >= 400) {
            roman.append("CD");
            arabic -= 400;
        } else {
            int a3 = arabic / 100;
            for (int i = 0; i < a3; i++) {
                roman.append("C");
            }
            arabic %= 100;
        }

        if (arabic >= 90) {
            roman.append("XC");
            arabic -= 90;
        } else {
            int a4 = arabic / 50;
            for (int i = 0; i < a4; i++) {
                roman.append("L");
            }
            arabic %= 50;
        }

        if (arabic >= 40) {
            roman.append("XL");
            arabic -= 40;
        } else {
            int a5 = arabic / 10;
            for (int i = 0; i < a5; i++) {
                roman.append("X");
            }
            arabic %= 10;
        }

        String[] ones = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        if (arabic > 0) {
            roman.append(ones[arabic - 1]);
        }

        return roman.toString();
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 3999: ");
        int userInput = scanner.nextInt();
        scanner.close();
        System.out.print(convertToRoman(userInput));
    }
}
