package Interface_0;

public class Interface01 {
    public static void main(String[] args) {
        Camera camera = new Camera();
        Phone phone = new Phone();
        Computer computer = new Computer();
        computer.work(camera);
        System.out.println("=============");
        computer.work(phone);
        System.out.println(Usbinterface.n);
    }
}