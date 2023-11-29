package WrapperType.Exercise;

public class HomeWork3 {
    public static void main(String[] args) {
        String name = "liu wei lin";
        Change(name);
    }

    protected static void Change(String name) {
        if (name == null) {
            System.out.println("名字为空");
            return;
        }
        String[] names = name.split(" ");
        if (!(names.length == 3)) {
            System.out.println("格式不对");
            return;
        }
        String format = String.format("%s,%s.%c", names[2], names[0], names[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
