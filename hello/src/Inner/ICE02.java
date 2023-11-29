package Inner;

public class ICE02 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.alam(new Bell() {
            public void ring() {
                System.out.println("起床了");
            }
        });
        phone.alam(new Bell() {
            public void ring() {
                System.out.println("上课");
            }
        });
    }
}

interface Bell {
    void ring();
}

class Phone {
    public void alam(Bell b) {
        b.ring();//为啥要写
    }
    
}