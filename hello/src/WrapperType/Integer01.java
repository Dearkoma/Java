package WrapperType;

public class Integer01 {
    public static void main(String[] args) {
        int n1 = 100;
        //JDK5
        //int ->Integer
        Integer integer = new Integer(n1);
        Integer valueof = Integer.valueOf(n1);
        //手动拆箱
        //Integer -> int
        int i = integer.intValue();
        //JDK5后
        int n2 = 500;
        Integer integer2 = n2;//底层还是new Integer(n2);或者Integer.valueOf(n2);
        //拆箱
        int n3 = integer2;//底层还是integer.intValue()方法
    }
}
