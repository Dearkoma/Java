package HouseRent.Interface_1;

public class Oracle implements Dbinterface{
    public void contect() {
        System.out.println("连接Oracle");
    }

    public void close() {
        System.out.println("关闭Oracle");
    }
}
