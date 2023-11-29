package WrapperType;

public class StringBuffer02 {
    public static void main(String[] args) {
        String s = null;
        StringBuffer sb = new StringBuffer();
        sb.append(s);
        System.out.println(sb.length());
        System.out.println(sb);
        StringBuffer sb1 = new StringBuffer(s);
        System.out.println(sb1);
    }
}
