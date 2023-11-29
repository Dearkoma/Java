package Exception_;

public class Exception_0 {
    public static void main(String[] args) {
        int n = 10;
        int m = 0;
        try {
            int res = n / m;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("运行结束");
    }
}
