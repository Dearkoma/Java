package Exception_;

public class TryException {
    public static void main(String[] args) {
            System.out.println(method());
    }

    public static int method() {
        int x = 1;
        try {
            x++;
            String[] name = new String[3];
            if (name[1].equals("tom")) {
                System.out.println(name[1]);
            } else {
                name[3] = "jiayou";
            }
            return x;
        } catch(ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (NullPointerException e) {
            //return ++x;//报这个错但是有finally所以执行return 4;
            return ++x;//整个方法要有返回值,try之后执行这个++x; return先不管,暂存temp临时变量值为3;
        } finally {
            ++x; //这里正常++x为4;
            System.out.println("x=" + x);
        }
    }
}