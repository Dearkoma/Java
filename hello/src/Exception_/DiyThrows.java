package Exception_;

public class DiyThrows {//custom定制的
    public static void main(String[] args) {
        int age = 800;
        if (!(age >= 18 && age <= 120)) {
            throw new AgeException("年龄不合法");
        }
        System.out.println("正确");
    }
}

class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}