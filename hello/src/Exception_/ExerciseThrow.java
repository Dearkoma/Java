package Exception_;

public class ExerciseThrow {
    public static void main(String[] args) {
        try {
            ReturnExceptionDeom.methodA();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        ReturnExceptionDeom.methodB();
    }
}

class ReturnExceptionDeom {
    static void methodA() {
        try {
            System.out.println("methodA");
            throw new RuntimeException("制造异常");
        } finally {
            System.out.println("A'finally");
        }
    }

    static void methodB() {
        try {
            System.out.println("methodB");
        } finally {
            System.out.println("B'finally");
        }
    }
}
