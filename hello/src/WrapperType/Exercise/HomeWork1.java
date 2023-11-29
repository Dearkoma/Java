package WrapperType.Exercise;

public class HomeWork1 {
    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println("===交换前===");
        System.out.println(str);
        try {
            str = reverse(str, 1, 4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("===交换后===");
        System.out.println(str);
    }

    protected static String reverse(String str, int start, int end) {
        if (!(str != null && start >= 0 && end > start && end < str.length())) {
            throw new RuntimeException("参数不对");   
        }
        char[] charArray = str.toCharArray();
        char temp =' ';
        for (int i = start, j = end; i < j; i++, j--) {
            temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }
        return new String(charArray);
    }
}
