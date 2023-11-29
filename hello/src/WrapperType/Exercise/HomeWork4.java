package WrapperType.Exercise;

public class HomeWork4 {
    public static void main(String[] args) {
        String str = "aca102ASD";
        Total(str);
    }

    protected static void Total(String str) {
        if (str == null) {
            System.out.println("数据错误");
        }
        int num = 0;
        int big = 0;
        int low = 0;
        int other = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                num++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                low++;
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                big++;
            } else {
                other++;
            }
        }
        System.out.println("数字"+num);
        System.out.println("小写"+low);
        System.out.println("大写" + big);
        System.out.println("其他"+other);
    }
}
