package Static;

public class payFee {
    public static void main(final String[] args) {
        pay tom = new pay("tom");
        tom.payFe(100);
        pay alice = new pay("alice");
        alice.payFe(200);
        pay.show();
    }
}

class pay {
    private String name;
    private static double fee;
    public pay(String name) {
        this.name = name;
    }

    public void payFe(double fee) {
        pay.fee += fee;
    }

    public  static void show() {
        System.out.println("total:" + pay.fee);
    }
}
