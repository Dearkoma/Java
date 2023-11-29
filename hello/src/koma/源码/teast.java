package koma.源码;
import java.util.Scanner;

public class teast {
    public static int calculateAdjustment(String str1, String str2) {
        // 如果两个字符串长度不同，则无法通过调整变为相等
        if (str1.length() != str2.length()) {
            return -1;
        }

        // 将第一个字符串调整n次，直到与第二个字符串相等
        int n = 0;
        while (!str1.equals(str2)) {//equals()相同返回1不同返回0;
            // 取出第一个字符
            char firstChar = str1.charAt(0);
            // 将第一个字符追加到字符串末尾
            str1 = str1.substring(1) + firstChar;
            n++;

            // 如果已经调整了字符串长度次数，仍无法变成B，则返回-1
            if (n > str1.length()) {
                return -1;
            }
        }

        return n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入字符串A：");
        String str1 = scanner.nextLine();
        System.out.print("请输入字符串B：");
        String str2 = scanner.nextLine();
        int adjustment = calculateAdjustment(str1, str2);
        if (adjustment == -1) {
            System.out.println("False");
        } else {
            System.out.println("将字符串A调整" + adjustment + "次后可以变成字符串B");
        }

        scanner.close();
    }
}