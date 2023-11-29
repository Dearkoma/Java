package Enum;

public class EnumMethod {
    public static void main(String[] args) {
        Season2 A = Season2.AUTUMO;
        System.out.println(A.name());//输出对应的枚举实例名
        System.out.println(A.ordinal());//输出次序,第一个为0,所以这个为2,真实为3类似于数组下标
        Season2[] values = Season2.values();
        for (Season2 season : values) {
            System.out.println(season);
        }
        Season2 valueof = Season2.valueOf("AUTUMO");
        System.out.println(valueof);
        System.out.println(Season2.AUTUMO.compareTo(Season2.SPRING));
    }
}