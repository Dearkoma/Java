package langqiao;

public class Prime {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;

        while (count < 1950) {
            if (isPrime(num)) {
                count++;
            }
            num++;
        }

        System.out.println("第1950个质数是: " + (num - 1));
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}