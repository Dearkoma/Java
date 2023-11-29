package Exception_;

import java.util.Scanner;

public class InputException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (true) {
            try {
                System.out.println("请输入一个数字：");
                num = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("输入错误，请重新输入！");
                e.printStackTrace();
            }
        }
        System.out.println("输入的数字是：" + num);
        sc.close();
    }
}
