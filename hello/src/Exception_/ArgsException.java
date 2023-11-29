package Exception_;

public class ArgsException {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数不对");
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            double res = calc(n1, n2);//可能出现/by zero错误
            System.out.println(res);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("参数形式不对");
        } catch (ArithmeticException e) {
            System.out.println("除数为0");
        }
        System.out.println("程序结束");
    }
    public static double calc(double x, double y) {
        return x / y;
    }
}
