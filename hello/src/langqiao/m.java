package langqiao;

public class m {
    public static void main(String[] args) {
        int n = 2;
        int count = 1;
        while (count <=1950) {
            if (prime(n)) {
                count++;
            }
            n++;//已经下一个数了
        }
        System.out.println(n-1);
    }

    public static boolean prime(int num) {
        if (num <= 2)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
