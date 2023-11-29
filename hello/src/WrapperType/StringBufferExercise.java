package WrapperType;

import java.util.Scanner;
public class StringBufferExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Price = "123456.9";
        StringBuffer sb = new StringBuffer(Price);
        int k = sb.lastIndexOf(".");
        System.out.println();
        for (int i = sb.lastIndexOf(".")-3; i > 0; i -= 3) {
            sb = sb.insert(i, ",");
        }
        System.out.println(sb);
        in.close();
    }
}
